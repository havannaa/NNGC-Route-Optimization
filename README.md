# NNGC-Route-Optimization
NNGC Route Optimization Spring Boot Rest API

**End Point**
```
http://localhost:8080/route/
```
**Method:** POST

**Request Body**
```
{
    "startTime":"1683970081",
    "optimizationType":"end anywhere",
    "startLocation":{
        "longitude":-74.08,
        "latitude":40.75
    },
    "routeLocations":[
        {
            "longitude":-82.94,
            "latitude":40.42
        },
        {
            "longitude":-89.47,
            "latitude":40.67
        },
        {
            "longitude":-84.17,
            "latitude":39.81
        }
    ]
}
```

**Example Request using cURL**

```
curl --location 'http://localhost:8080/route' --header 'Content-Type: application/json' --data '{
    "startTime":"1683970081",
    "optimizationType":"end anywhere",
    "startLocation":{
        "longitude":-74.08,
        "latitude":40.75
    },
    "routeLocations":[
        {
            "longitude":-82.94,
            "latitude":40.42
        },
        {
            "longitude":-89.47,
            "latitude":40.67
        },
        {
            "longitude":-84.17,
            "latitude":39.81
        }
    ]
}'

```
**Example Response**
```
{
    "startingTime":"1683970081",
    "destinationArrivalTime":"1684074652",
    "totalStops":4,
    "totalDuration":"104571",
    "routeDistance":"3005613",
    "routeType":"end anywhere",
    "routeList":[
        {
            "startLocation":{
                "longitude":-74.08,
                "latitude":40.75
            },
            "startLocationName":"QW2C+22R Kearny, NJ, USA",
            "endLocation":{
                "longitude":-82.94,
                "latitude":40.42
            },
            "endLocationName":"C3C6+222 Ashley, OH, USA",
            "projectedStartTime":"1683970081",
            "projectedArrivalTime":"1683999676",
            "projectedDepartureTime":"1683999976"
        },
        {
            "startLocation":{
                "longitude":-82.94,
                "latitude":40.42
            },
            "startLocationName":"C3C6+222 Ashley, OH, USA",
            "endLocation":{
                "longitude":-84.17,
                "latitude":39.81
            },
            "endLocationName":"RR6H+2X5 Dayton, OH, USA",
            "projectedStartTime":"1683999976",
            "projectedArrivalTime":"1684006075",
            "projectedDepartureTime":"1684006375"
        },
        {
            "startLocation":{
                "longitude":-84.17,
                "latitude":39.81
            },
            "startLocationName":"RR6H+2X5 Dayton, OH, USA",
            "endLocation":{
                "longitude":-89.47,
                "latitude":40.67
            },
            "endLocationName":"MGCJ+222 Washington, IL, USA",
            "projectedStartTime":"1684006375",
            "projectedArrivalTime":"1684024236",
            "projectedDepartureTime":"1684024536"
        },
        {
            "startLocation":{
                "longitude":-89.47,
                "latitude":40.67
            },
            "startLocationName":"MGCJ+222 Washington, IL, USA",
            "endLocation":{
                "longitude":-74.08,
                "latitude":40.75
            },
            "endLocationName":"QW2C+22R Kearny, NJ, USA",
            "projectedStartTime":"1684024536",
            "projectedArrivalTime":"1684074352",
            "projectedDepartureTime":"1684074652"
        }
    ]
}
```

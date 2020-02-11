package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Normal36Response(

    @field:Json(name = "records")
    val records: Records = Records(),

    @field:Json(name = "result")
    val result: Result = Result(),

    @field:Json(name = "success")
    val success: String = ""
)

/*
{
  "success": "true",
  "result": {
    "resource_id": "F-C0032-001",
    "fields": [
      {
        "id": "datasetDescription",
        "type": "String"
      },
      {
        "id": "locationName",
        "type": "String"
      },
      {
        "id": "parameterName",
        "type": "String"
      },
      {
        "id": "parameterValue",
        "type": "String"
      },
      {
        "id": "parameterUnit",
        "type": "String"
      },
      {
        "id": "startTime",
        "type": "Timestamp"
      },
      {
        "id": "endTime",
        "type": "Timestamp"
      }
    ]
  },
  "records": {
    "datasetDescription": "三十六小時天氣預報",
    "location": [
      {
        "locationName": "臺北市",
        "weatherElement": [
          {
            "elementName": "Wx",
            "time": [
              {
                "startTime": "2020-02-09 12:00:00",
                "endTime": "2020-02-09 18:00:00",
                "parameter": {
                  "parameterName": "陰天",
                  "parameterValue": "7"
                }
              },
              {
                "startTime": "2020-02-09 18:00:00",
                "endTime": "2020-02-10 06:00:00",
                "parameter": {
                  "parameterName": "晴時多雲",
                  "parameterValue": "2"
                }
              },
              {
                "startTime": "2020-02-10 06:00:00",
                "endTime": "2020-02-10 18:00:00",
                "parameter": {
                  "parameterName": "晴時多雲",
                  "parameterValue": "2"
                }
              }
            ]
          },
          {
            "elementName": "PoP",
            "time": [
              {
                "startTime": "2020-02-09 12:00:00",
                "endTime": "2020-02-09 18:00:00",
                "parameter": {
                  "parameterName": "10",
                  "parameterUnit": "百分比"
                }
              },
              {
                "startTime": "2020-02-09 18:00:00",
                "endTime": "2020-02-10 06:00:00",
                "parameter": {
                  "parameterName": "10",
                  "parameterUnit": "百分比"
                }
              },
              {
                "startTime": "2020-02-10 06:00:00",
                "endTime": "2020-02-10 18:00:00",
                "parameter": {
                  "parameterName": "10",
                  "parameterUnit": "百分比"
                }
              }
            ]
          },
          {
            "elementName": "MinT",
            "time": [
              {
                "startTime": "2020-02-09 12:00:00",
                "endTime": "2020-02-09 18:00:00",
                "parameter": {
                  "parameterName": "13",
                  "parameterUnit": "C"
                }
              },
              {
                "startTime": "2020-02-09 18:00:00",
                "endTime": "2020-02-10 06:00:00",
                "parameter": {
                  "parameterName": "12",
                  "parameterUnit": "C"
                }
              },
              {
                "startTime": "2020-02-10 06:00:00",
                "endTime": "2020-02-10 18:00:00",
                "parameter": {
                  "parameterName": "12",
                  "parameterUnit": "C"
                }
              }
            ]
          },
          {
            "elementName": "CI",
            "time": [
              {
                "startTime": "2020-02-09 12:00:00",
                "endTime": "2020-02-09 18:00:00",
                "parameter": {
                  "parameterName": "寒冷"
                }
              },
              {
                "startTime": "2020-02-09 18:00:00",
                "endTime": "2020-02-10 06:00:00",
                "parameter": {
                  "parameterName": "寒冷"
                }
              },
              {
                "startTime": "2020-02-10 06:00:00",
                "endTime": "2020-02-10 18:00:00",
                "parameter": {
                  "parameterName": "寒冷至稍有寒意"
                }
              }
            ]
          },
          {
            "elementName": "MaxT",
            "time": [
              {
                "startTime": "2020-02-09 12:00:00",
                "endTime": "2020-02-09 18:00:00",
                "parameter": {
                  "parameterName": "15",
                  "parameterUnit": "C"
                }
              },
              {
                "startTime": "2020-02-09 18:00:00",
                "endTime": "2020-02-10 06:00:00",
                "parameter": {
                  "parameterName": "13",
                  "parameterUnit": "C"
                }
              },
              {
                "startTime": "2020-02-10 06:00:00",
                "endTime": "2020-02-10 18:00:00",
                "parameter": {
                  "parameterName": "20",
                  "parameterUnit": "C"
                }
              }
            ]
          }
        ]
      }
    ]
  }
}
 */
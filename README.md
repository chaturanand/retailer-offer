Retailer Offer Rewards Restful API
===============================

This is a Web api of Retailer offer Rewards Restful api in which A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.


 

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

 

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 and $100 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

 

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

-----------------------------------------------------------
### Tools
- Java
- Spring Boot 
- Rest API
- MYSQL Database
- Data Set in resource/data.sql
- Docker
- Testing


------------------------------------------------------------

###To Run this project locally

cmd: mvn spring-boot: run


-------------------------------------------------------------------------------
### API Request and response is

-------------------------------------------------------------------------------
### 1. End Point of Get All Customer Reward
This is a End point of Getting all Customer Reward

curl --location --request GET 'localhost:8080/api/rewards/customers'

#Response:
[
    {
        "id": 1000,
        "name": "Marco",
        "transactions": [
            {
                "points": 15,
                "id": 1005,
                "total": 65.75,
                "description": "Purchase 20",
                "saveDate": "2019-10-05T04:35:10.000+0000"
            },
            {
                "points": 0,
                "id": 1002,
                "total": 50.0,
                "description": "Purchase 2",
                "saveDate": "2019-10-01T04:35:10.000+0000"
            },
            {
                "points": 200,
                "id": 1004,
                "total": 175.32,
                "description": "Purchase 10",
                "saveDate": "2019-10-07T04:35:10.000+0000"
            },
            {
                "points": 50,
                "id": 1001,
                "total": 100.0,
                "description": "Purchase 1",
                "saveDate": "2019-10-17T04:35:10.000+0000"
            },
            {
                "points": 90,
                "id": 1003,
                "total": 120.0,
                "description": "Purchase 3",
                "saveDate": "2019-10-10T04:35:10.000+0000"
            },
            {
                "points": 0,
                "id": 1009,
                "total": 42.8,
                "description": "Purchase 31",
                "saveDate": "2019-10-18T11:25:10.000+0000"
            },
            {
                "points": 270,
                "id": 1006,
                "total": 210.5,
                "description": "Purchase 30",
                "saveDate": "2019-10-03T04:35:10.000+0000"
            }
        ],
        "rewardPoints": 625,
        "totalPurchases": 764.37
    },
    {
        "id": 1001,
        "name": "Luis",
        "transactions": [
            {
                "points": 250,
                "id": 1008,
                "total": 200.0,
                "description": "Purchase 5",
                "saveDate": "2019-10-17T04:35:10.000+0000"
            }
        ],
        "rewardPoints": 250,
        "totalPurchases": 200.0
    },
    {
        "id": 1002,
        "name": "Selene",
        "transactions": [
            {
                "points": 30,
                "id": 1201,
                "total": 80.5,
                "description": "Purchase 201",
                "saveDate": "2019-10-05T09:15:10.000+0000"
            },
            {
                "points": 82,
                "id": 1202,
                "total": 116.14,
                "description": "Purchase 202",
                "saveDate": "2019-10-10T05:45:10.000+0000"
            },
            {
                "points": 0,
                "id": 1200,
                "total": 25.6,
                "description": "Purchase 200",
                "saveDate": "2019-10-01T06:35:10.000+0000"
            }
        ],
        "rewardPoints": 112,
        "totalPurchases": 222.23999999999998
    }
]

----------------------------------------------------------------------------------------------------
### 2. End Point of Get Particular Customer Reward
This is a End point of Getting Particular Customer Reward

curl --location --request GET 'localhost:8080/api/rewards/customers/1000'

#Response:

{
    "id": 1000,
    "name": "Marco",
    "transactions": [
        {
            "points": 50,
            "id": 1001,
            "total": 100.0,
            "description": "Purchase 1",
            "saveDate": "2019-10-17T04:35:10.000+0000"
        },
        {
            "points": 270,
            "id": 1006,
            "total": 210.5,
            "description": "Purchase 30",
            "saveDate": "2019-10-03T04:35:10.000+0000"
        },
        {
            "points": 0,
            "id": 1009,
            "total": 42.8,
            "description": "Purchase 31",
            "saveDate": "2019-10-18T11:25:10.000+0000"
        },
        {
            "points": 90,
            "id": 1003,
            "total": 120.0,
            "description": "Purchase 3",
            "saveDate": "2019-10-10T04:35:10.000+0000"
        },
        {
            "points": 0,
            "id": 1002,
            "total": 50.0,
            "description": "Purchase 2",
            "saveDate": "2019-10-01T04:35:10.000+0000"
        },
        {
            "points": 200,
            "id": 1004,
            "total": 175.32,
            "description": "Purchase 10",
            "saveDate": "2019-10-07T04:35:10.000+0000"
        },
        {
            "points": 15,
            "id": 1005,
            "total": 65.75,
            "description": "Purchase 20",
            "saveDate": "2019-10-05T04:35:10.000+0000"
        }
    ],
    "rewardPoints": 625,
    "totalPurchases": 764.3699999999999
}







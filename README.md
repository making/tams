# Tiny Account Management System (TAMS)

## Resource
### Account
#### GET Account

GET /tams/accounts/0000001

    {
       "accountId": "4b4394663d2a4505b27e63beaa417aff",
       "firstName": "Taro",
       "lastName": "Yamada",
       "birthDate": "1980-01-01",
       "status": "ACTIVATED",
       "credentials":    {
          "userId": "u00001",
          "email": "foo@example.com",
          "password": "xxxx",
          "status": "ACTIVATED",
          "lockedAt": null,
          "createdAt": 1361887762248,
          "updatedAt": 1361887762248,
          "version": 0
       },
       "roles":    [
          "ADMIN",
          "USER"
       ],
       "createdAt": 1361887762248,
       "updatedAt": 1361887762248,
       "version": 0
    }

status

* ACTIVATED
* DEACTIVATED
* WAITING_FOR_ACTIVATION


credentials.status

* ACTIVATED
* EXPIRED
* LOCKED

#### PUT Account

PUT /tams/accounts/0000001

    {
        "email" : "bar@example.com"
    }

#### DELETE Account

DELETE /tams/accounts/0000001

### Accounts
#### POST Accounts

POST /tams/accounts

    {
        "firstName" : "Taro",
        "lastName" : "Yamada",
        "birthDate" : "1980-01-01",
        "status" : "ACTIVATED",
        "credentials“ : {
            "password" : "<Raw Password>"
        },
        "email" : "foo@example.com"     
    }

#### GET Accounts

    [
          {
          "accountId": "4b4394663d2a4505b27e63beaa417aff",
          "firstName": "Taro",
          "lastName": "Yamada",
          "birthDate": "1980-01-01",
          "status": "ACTIVATED",
          "credentials":       {
             "userId": "u00001",
             "email": "foo@example.com",
             "password": "xxxx",
             "status": "ACTIVATED",
             "lockedAt": null,
             "createdAt": 1361887762248,
             "updatedAt": 1361887762248,
             "version": 0
          },
          "roles":       [
             "ADMIN",
             "USER"
          ],
          "createdAt": 1361887762248,
          "updatedAt": 1361887762248,
          "version": 0
       },
          {
          "accountId": "18a2e26a698546d6bbc13c5fb65eabcb",
          "firstName": "Ichiro",
          "lastName": "Suzuki",
          "birthDate": "1980-01-01",
          "status": "ACTIVATED",
          "credentials":       {
             "userId": "u00002",
             "email": "bar@example.com",
             "password": "xxxx",
             "status": "ACTIVATED",
             "lockedAt": null,
             "createdAt": 1361887762248,
             "updatedAt": 1361887762248,
             "version": 0
          },
          "roles":       [
             "ADMIN",
             "USER"
          ],
          "createdAt": 1361887762248,
          "updatedAt": 1361887762248,
          "version": 0
       }
    ]


## OAuth
### Issue Token


### Revoke Token

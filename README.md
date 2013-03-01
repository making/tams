# Tiny Account Management System (TAMS)

## Resource
### Account
#### GET Account

    $ curl -v http://localhost:8080/tams/accounts/4b4394663d2a4505b27e63beaa417aff
    * About to connect() to localhost port 8080 (#0)
    *   Trying 127.0.0.1...
    * connected
    * Connected to localhost (127.0.0.1) port 8080 (#0)
    > GET /tams/accounts/4b4394663d2a4505b27e63beaa417aff HTTP/1.1
    > User-Agent: curl/7.24.0 (x86_64-apple-darwin12.0) libcurl/7.24.0 OpenSSL/0.9.8r zlib/1.2.5
    > Host: localhost:8080
    > Accept: */*
    > 
    < HTTP/1.1 200 OK
    < Server: Apache-Coyote/1.1
    < Content-Type: application/json;charset=UTF-8
    < Transfer-Encoding: chunked
    < Date: Thu, 28 Feb 2013 14:23:29 GMT
    < 
    * Connection #0 to host localhost left intact
    
    {
       "accountId": "4b4394663d2a4505b27e63beaa417aff",
       "firstName": "Taro",
       "lastName": "Yamada",
       "birthDate": "1980-01-01",
       "accountStatus": "ACTIVATED",
       "userId": "u00001",
       "email": "foo@example.com",
       "password": "xxxx",
       "passwordStatus": "ACTIVATED",
       "passwordLockedAt": null,
       "passwordUpdatedAt": "2013-02-26T11:09:22.248+0000",
       "roles":    [
          "ADMIN",
          "USER"
       ],
       "createdAt": "2013-02-26T11:09:22.248+0000",
       "updatedAt": "2013-02-26T11:09:22.248+0000",
       "version": 0
    }

accountStatus

* ACTIVATED
* DEACTIVATED
* WAITING_FOR_ACTIVATION


passwordStatus

* ACTIVATED
* EXPIRED
* LOCKED

#### PUT Account


    {
        "email" : "bar@example.com"
    }

#### DELETE Account

### Accounts
#### POST Accounts

    $  curl -v -H Accept:application/json -H Content-type:application/json -X POST -d {"firstName": "Taro", "lastName": "Yamada", "birthDate": "1980-01-01", "accountStatus": "ACTIVATED", "userId": "u00003", "email": "foo3@example.com", "password": "xxxx", "passwordStatus": "ACTIVATED", "roles": ["USER"]} http://localhost:8080/tams/accounts
    * About to connect() to localhost port 8080 (#0)
    *   Trying 127.0.0.1...
    * connected
    * Connected to localhost (127.0.0.1) port 8080 (#0)
    > POST /tams/accounts HTTP/1.1
    > User-Agent: curl/7.24.0 (x86_64-apple-darwin12.0) libcurl/7.24.0 OpenSSL/0.9.8r zlib/1.2.5
    > Host: localhost:8080
    > Accept:application/json
    > Content-type:application/json
    > Content-Length: 219
    > 
    * upload completely sent off: 219 out of 219 bytes
    < HTTP/1.1 201 Created
    < Server: Apache-Coyote/1.1
    < Content-Type: application/json;charset=UTF-8
    < Transfer-Encoding: chunked
    < Date: Fri, 01 Mar 2013 00:23:01 GMT
    < 
    * Connection #0 to host localhost left intact
    {"accountId":"102ac794d6e6485fae66384ebc0f953b","firstName":"Taro","lastName":"Yamada","birthDate":"1980-01-01","accountStatus":"ACTIVATED","userId":"u00003","email":"foo3@example.com","password":"xxxx","passwordStatus":"ACTIVATED","passwordLockedAt":null,"passwordUpdatedAt":"2013-03-01T12:23:01.194+0000","roles":["USER"],"createdAt":"2013-03-01T12:23:01.194+0000","updatedAt":"2013-03-01T12:23:01.194+0000","version":0}
    * Closing connection #0

#### GET Accounts

    $ curl -v http://localhost:8080/tams/accounts 
    * About to connect() to localhost port 8080 (#0)
    *   Trying 127.0.0.1...
    * connected
    * Connected to localhost (127.0.0.1) port 8080 (#0)
    > GET /tams/accounts HTTP/1.1
    > User-Agent: curl/7.24.0 (x86_64-apple-darwin12.0) libcurl/7.24.0 OpenSSL/0.9.8r zlib/1.2.5
    > Host: localhost:8080
    > Accept: */*
    > 
    < HTTP/1.1 200 OK
    < Server: Apache-Coyote/1.1
    < Content-Type: application/json;charset=UTF-8
    < Transfer-Encoding: chunked
    < Date: Thu, 28 Feb 2013 14:19:46 GMT
    < 
    * Connection #0 to host localhost left intact
    
    [
          {
          "accountId": "4b4394663d2a4505b27e63beaa417aff",
          "firstName": "Taro",
          "lastName": "Yamada",
          "birthDate": "1980-01-01",
          "accountStatus": "ACTIVATED",
          "userId": "u00001",
          "email": "foo@example.com",
          "password": "xxxx",
          "passwordStatus": "ACTIVATED",
          "passwordLockedAt": null,
          "passwordUpdatedAt": "2013-02-26T11:09:22.248+0000",
          "roles":       [
             "ADMIN",
             "USER"
          ],
          "createdAt": "2013-02-26T11:09:22.248+0000",
          "updatedAt": "2013-02-26T11:09:22.248+0000",
          "version": 0
       },
          {
          "accountId": "18a2e26a698546d6bbc13c5fb65eabcb",
          "firstName": "Ichiro",
          "lastName": "Suzuki",
          "birthDate": "1980-01-01",
          "accountStatus": "ACTIVATED",
          "userId": "u00002",
          "email": "bar@example.com",
          "password": "xxxx",
          "passwordStatus": "ACTIVATED",
          "passwordLockedAt": null,
          "passwordUpdatedAt": "2013-02-26T11:09:22.248+0000",
          "roles":       [
             "ADMIN",
             "USER"
          ],
          "createdAt": "2013-02-26T11:09:22.248+0000",
          "updatedAt": "2013-02-26T11:09:22.248+0000",
          "version": 0
       }
    ]


## OAuth
### Issue Token


### Revoke Token

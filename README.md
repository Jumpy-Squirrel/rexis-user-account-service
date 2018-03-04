rexis-user-account-service
==========================

An oauth2/oidc authorization server implemented using Spring Boot 2.0

Simple Command Line Examples
----------------------------

You can obtain a token like this:

```
curl localhost:8080/oauth/token \
-d grant_type=client_credentials \
-d client_id=democlient \
-d client_secret=demosecret
```

Use the token like this:

```
curl localhost:8080/demo \
--header "Authorization: Bearer eyJ..."
```

Todos
-----
* go through all configuration options for auth server, resource server
  * get RSA keys to work
  * configure openid compliant keyset uri  
* externalize configuration and client list to properties
* add apis for useraccount, usergroup, role creation and assignment

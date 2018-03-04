rexis-user-account-service
==========================

An oauth2/oidc authorization server implemented using Spring Boot 2.0

Simple Command Line Examples
----------------------------

You can obtain a token like this:

`curl democlient:demosecret@localhost:8080/oauth/token -d grant_type=client_credentials`

Use the token like this:

`curl localhost:8080/demo --header "Authorization: Bearer eyJ..."`


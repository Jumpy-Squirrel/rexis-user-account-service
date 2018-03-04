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

Links
-----
* Spring Security / OAuth
  * [Spring Security 5 Reference Manual](https://docs.spring.io/spring-security/site/docs/5.0.3.RELEASE/reference/htmlsingle/#jc-oauth2login)
  * [Spring Blog: Next Generation OAuth 2.0 Support](https://spring.io/blog/2018/01/30/next-generation-oauth-2-0-support-with-spring-security)
  * [Bridge between old and new OAuth Support](https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/htmlsingle/)
  * [Spring Security OAuth Docs](http://projects.spring.io/spring-security-oauth/docs/oauth2.html)
  * [Baeldung article: Spring Security OAuth Jwt](http://www.baeldung.com/spring-security-oauth-jwt)
* Spring Cloud Contract
  * [Spring Cloud Contract Reference Docs (2.0.0.M7)](http://cloud.spring.io/spring-cloud-static/spring-cloud-contract/2.0.0.M7/single/spring-cloud-contract.html#_what_is_this_value_consumer_producer)

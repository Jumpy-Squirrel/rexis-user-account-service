package contracts

org.springframework.cloud.contract.spec.Contract.make {
    description('''
given:
        The oauth2 client 'democlient' with client secret 'demosecret' is registered with the authorization server
when:
        A client service requests a token with grant_type 'client_credentials'
then:
        It is issued a valid jwt token for client 'democlient'
''')
    request {
        method 'POST'
        url execute('getFullUrl("/oauth/token")')
        body('grant_type=client_credentials&client_id=democlient&client_secret=demosecret')
        headers {
            contentType(applicationFormUrlencoded())
        }
    }
    response {
        status 200
        body(
                access_token: value(client("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJhbGwiXSwiZXhwIjoxNTIwMjIzMDkwLCJqdGkiOiIxYmZmZWUzNy05ODk4LTRjN2YtYTRmYi1hMWM2NjczMjBlYWMiLCJjbGllbnRfaWQiOiJkZW1vY2xpZW50In0.JNeYn_9bQ0_wDrGBHE90qjM66QaSrWhw4Pnpx2zUJ-o"),
                                    server(regex("[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+"))),
                token_type: 'bearer',
                expires_in: value(client('43200'),
                                  server(regex("[0-9]+"))),
                scope: 'all',
                jti: value(client('1bffee37-9898-4c7f-a4fb-a1c667320eac'),
                           server(regex("[0-9a-f-]+")))
        )
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}

var express = require('express');
var middleware = require('swagger-express-middleware');
 
var app = express();
 
middleware('api_swagger2.json', app, function(err, middleware) {
    // Add all the Swagger Express Middleware, or just the ones you need.
    // NOTE: Some of these accept optional options (omitted here for brevity)
    app.use(
        middleware.metadata(),
        middleware.CORS(),
        middleware.files(),
        middleware.parseRequest(),
        middleware.validateRequest(),
        middleware.mock()
    );
 
    app.listen(8000, function() {
        console.log('Mock Swagger corriendo...');
    });
});
const express = require('express');
const { createMockMiddleware } = require('openapi-mock-express-middleware');

const app = express();

app.use(
  '', // root path for the mock server
  createMockMiddleware({ spec: '../heladeria-api-spec/oas3/hypermedia/api.yaml' }),
);

app.listen(8000, () => console.log('Mock OpenAPI corriendo'));

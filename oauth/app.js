const express = require('express')
const app = express()
const port = 8080

app.get('/', (req, res) => {
    res.send(`Code: ${req.query.code}<br>`)
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})

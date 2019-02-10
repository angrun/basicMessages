<template>
  <div id="app-message">
    <p>{{message}}</p>
    <h1></h1>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        message: []
      }
    },
    methods: {},
    created() {
      this.$http.get('http://localhost:8081/hello').then(function(response)  {
        this.message = response.body.message;

      })
    }
  }
</script>



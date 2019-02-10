<template>
  <div id="app-message">
    <h1>All blog articles</h1>
    <!--<div v-for="blog in blogs" class="single-messgae">-->

    <!--<h2>{{blog.title}}</h2>-->
    <!--<article>{{blog.body}}</article>-->


    <h1></h1>
  </div>
</template>

<script>

  export default {

    data() {
      return {
        blogs: []
      }
    },
    methods: {},
    created() {
      this.$http.get('http://localhost:8081/hello').then((response) => {

        console.log(response);

      })

    }
  }
</script>



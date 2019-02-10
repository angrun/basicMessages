<template>
  <div>

    <app-message></app-message>

  </div>
</template>

<script>

  import message from './components/Message.vue';

  export default {
    components: {
      'app-message': message
    },
    data() {
      return {}
    },
    methods: {}
  }
</script>



<template>
    <body>
        <Header/>
        <div class="main-layout">
            <RouterView/>
        </div>
    </body>
</template>

<script>
import Header from "./components/Header.vue"

export default{
    name: "App",
    components: {
        Header
    }
}
</script>

<style>
body{
    height: 100%;
    background-color: #FAFBFF;
    margin: 0;
    padding: 0;
}

#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #1C1C1C;
}

.main-layout{
    max-height: 1800px;
    padding: 20px;
}
</style>
<template>
	<header>
	<div class="header">
		<a href="">로그인</a>
	</div>
	</header>
</template>

<script>
export default{
	name: "Header",
	methods: {},
	data() {
		return {
			
		};
	},
	components: {},
}
</script>

<style scoped>
header{
    width: 100%;
    background-color: white;
    box-shadow: rgba(0, 0, 0, 0.07) 0px 3px 4px 0px;
}
.header{
	height: 40px;
	display: flex;
	align-items: center;
	flex-flow: row-reverse;
    padding: 0px 20px 0px 20px;
}
.header > a{
	font-size: 13px;
	text-decoration: none;
	color: #1C1C1C;
}
</style>
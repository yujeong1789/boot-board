<template>
    <div class="list-layout">
        <div class="list-title">게시판</div>
        <div class="list-table">
            <table>
                <thead>
                    <tr>
                        <th>글번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>조회수</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    <tr :id="i.no" v-for="i in testData" :key="i">
                        <td>{{ i.no }}</td>
                        <td>{{ i.title }}</td>
                        <td>{{ i.writer }}</td>
                        <td>{{ i.view }}</td>
                        <td>{{ i.regdate }}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="list-paging">
            <a href="">1</a>
            <a href="">2</a>
            <a href="">3</a>
        </div>
    </div>
</template>

<script>
// import axios from 'axios';
const axios = require('axios');
export default{
    name: "Home",
    data(){
        return{
            testData: null
        }
    },
    mounted(){
        this.load();
    },
    methods: {
        load(){
            axios.get('/api/board/list').then(res => {
                console.log(res.data);
                this.testData = res.data;
            });
        }
    }
}
</script>

<style scoped>
.list-layout{
    display: flex;
    justify-content: center;
    flex-flow: column;
    padding: 20px;
}

.list-layout > div{
    display: flex;
    justify-content: center;
}

.list-title{
    margin: 50px 0px 30px 0px;
    font-size: 30px;
    font-weight: 500;
}
.list-table{
    background-color: white;
    border-radius: .375rem;
    box-shadow: 0 2px 6px 0 rgba(67,89,113,.12);
    margin-bottom: 30px;
    padding: 15px;
}
.list-table > table{
    width: 100%;
}
.list-table thead th{
    width: 20%;
}
.list-table tbody td{
    text-align: center;
}
</style>
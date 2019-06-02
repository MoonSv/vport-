<template>
  <div>
    <div class="wrap">
      <div class="search-bar">
        <el-form :inline="true" :model="formInline" class="demo-form-inline">
          <el-form-item label="课程名称">
            <el-input v-model="formInline.courseName" placeholder="课程名称"></el-input>
          </el-form-item>
          <el-form-item label="课程级别">
            <el-select v-model="formInline.level" placeholder="课程级别">
              <el-option v-for="level in crsLevels" :key="level.id" :label="level.type" :value="level.id"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="最低年龄">
            <el-input-number
              v-model="formInline.beginAge"
              :min="3"
              :max="30"
              label="描述文字"
            ></el-input-number>
          </el-form-item>
          <el-form-item label="最高年龄">
            <el-input-number
              v-model="formInline.endAge"
              :min="50"
              :max="80"
              label="描述文字"
            ></el-input-number>
          </el-form-item>
          <el-form-item label="收费标准">
            <el-input v-model="formInline.fee"></el-input>
          </el-form-item>
          <!-- <el-form-item label="课程周期">
            <el-input v-model="formInline.trainingPeriod"></el-input>
          </el-form-item> -->
          <el-form-item>
            <el-button type="primary" @click="onSubmit">搜索</el-button>
          </el-form-item>
        </el-form>
      </div>
      <ul class="course-group">
        <li class="course-card" v-for="crs in crsList" :key="crs.id">
          <p class="class-name">{{crs.courseName}}</p>
          <p class="trainer-name">课程级别：{{crs.level}}</p>
          <p class="class-date">年龄：{{crs.beginAge}} - {{crs.endAge}}岁</p>
          <p class="class-time">收费标准：{{crs.fee}}</p>
          <p class="class-time">最高年龄：{{crs.endAge}}</p>
          <span class="view-dtl">
            <el-dropdown trigger="click">
              <i class="el-icon-more-outline" style="font-size: 24px"></i>
              <el-dropdown-menu slot="dropdown">
                <el-dropdown-item>查看</el-dropdown-item>
                <el-dropdown-item>编辑</el-dropdown-item>
                <el-dropdown-item>删除</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </span>
        </li>
        <li class="plus-card">
          <i class="el-icon-circle-plus-outline plus-button" @click="clickNewCrs"></i>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import qs from 'qs'
export default {
  name: "",
  props: [""],
  data() {
    return {
      formInline: {
        courseName: "",
        level: "",
        beginAge: 0,
        endAge: 0,
        fee: "",
        trainingPeriod: ""
      },
      crsLevels:[
        {
          "id": 1,
          "type": "S"
        },
        {
          "id": 2,
          "type": "A"
        },
        {
          "id": 3,
          "type": "B"
        },
        {
          "id": 4,
          "type": "C"
        },
        {
          "id": 5,
          "type": "D"
        },
      ],
      crsList:[
        {
          "beginAge": 10,
          "courseName": "还行课程",
          "endAge": 30,
          "fee": 999.5,
          "level": "B",
          "id": 1
        },
        {
          "beginAge": 10,
          "courseName": "牛逼课程",
          "endAge": 50,
          "fee": 1699.5,
          "level": "S",
          "id": 2
        },
      ]
    };
  },

  components: {},

  computed: {},

  beforeMount() {
    this.getCrsList()
    this.getLevels()
  },

  mounted() {},

  methods: {
    clickNewCrs() {
      this.$router.push({ name: "CourseForm" })
    },
    getLevels(){
      this.$http
        .get("course/get_levels")
        .then(res => {
          console.log("course levels: ")
          console.log(res.data)
          this.crsLevels = res.data

        })
        .catch(err => {
          console.log(res)
        })
    },
    getCrsList() {
      this.$http
        .get("course/list")
        .then(res => {
          if (res.data) {
            console.log(res.data)
            this.crsList = res.data
          }
        })
        .catch(err => {
          console.log(err)
        });
    },
    onSubmit() {
      console.log("submit!")
      this.$http
      .post("course/list", qs.stringify(this.formInline))
      .then(res=>{
        if (res) {
          console.log(res)
        }
      })
      .catch(err=>{
        console.log(err)
      })
    }
  },

  watch: {}
};
</script>
<style lang='' scoped>
.wrap {
  color: #fff;
}
.course-group {
  display: flex;
  flex-wrap: wrap;
}
.course-card {
  width: 300px;
  height: 190px;
  background-color: rgb(55, 57, 78);
  margin: 10px;
  padding: 10px;
  border-radius: 10px;
  position: relative;
}
.plus-card {
  width: 300px;
  height: 190px;
  background-color: rgba(177, 177, 177, 0.404);
  margin: 10px;
  padding: 10px;
  border-radius: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
}
.plus-button {
  font-size: 100px;
  color: #b7b7b7bd;
  cursor: pointer;
  transition: all 0.2s;
}
.plus-button:hover {
  color: #8a8a8abd;
}
p {
  margin-bottom: 5px;
}
.view-dtl {
  position: absolute;
  right: 10px;
  top: 10px;
  cursor: pointer;
}
.el-dropdown {
  color: #fff;
}
.erl-st > ul {
  margin-top: 10px;
  display: flex;
}
.erl-st > ul > li img {
  width: 17px;
  height: 17px;
}
</style>
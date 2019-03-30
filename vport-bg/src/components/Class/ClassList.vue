<template>
  <div>
    <div class="wrap">
      <div class="advanced-search">
        <el-form :inline="true" :model="form" class="demo-form-inline">
          <el-form-item label="班级名称">
            <el-input v-model="form.name"></el-input>
          </el-form-item>
          <el-form-item label="课程内容">
            <el-select v-model="form.level" placeholder="请选择对应课程">
              <el-option label="S" value="S"></el-option>
              <el-option label="A" value="A"></el-option>
              <el-option label="B" value="B"></el-option>
              <el-option label="C" value="C"></el-option>
              <el-option label="D" value="D"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="任课教练">
            <el-select v-model="form.trainer" placeholder="请选择教练">
              <el-option label="教练A" value="教练A"></el-option>
              <el-option label="教练B" value="教练B"></el-option>
              <el-option label="教练C" value="教练C"></el-option>
              <el-option label="教练D" value="教练D"></el-option>
              <el-option label="教练E" value="教练E"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="开课日期">
            <el-date-picker v-model="form.beginDate" type="date" placeholder="选择日期"></el-date-picker>
          </el-form-item>
          <el-form-item label="训练时间">
            <el-time-select
              placeholder="起始时间"
              v-model="form.startTime"
              :picker-options="{
            start: '08:30',
            step: '00:15',
            end: '18:30'
            }"
            ></el-time-select>
            <el-time-select
              placeholder="结束时间"
              v-model="form.endTime"
              :picker-options="{
            start: '08:30',
            step: '00:15',
            end: '18:30',
            minTime: form.startTime
            }"
            ></el-time-select>
          </el-form-item>
          <el-form-item label="截止报名日期">
            <el-date-picker v-model="form.deadLine" type="date" placeholder="选择日期"></el-date-picker>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">搜索</el-button>
          </el-form-item>
        </el-form>
      </div>
      <ul class="course-group">
        <li class="course-card">
          <p class="class-name">Class name</p>
          <p class="trainer-name">教练：Trainer</p>
          <p class="class-date">开班日期：2019/03/01</p>
          <p class="class-time">课程时间：周二 14:00-16：00</p>
          <div class="erl-st">报名人数：
            <ul>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
            </ul>
          </div>
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
        <li class="course-card">
          <p class="class-name">Class name</p>
          <p class="trainer-name">教练：Trainer</p>
          <p class="class-date">开班日期：2019/03/01</p>
          <p class="class-time">课程时间：周二 14:00-16：00</p>
          <div class="erl-st">报名人数：
            <ul>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
            </ul>
          </div>
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
        <li class="course-card">
          <p class="class-name">Class name</p>
          <p class="trainer-name">教练：Trainer</p>
          <p class="class-date">开班日期：2019/03/01</p>
          <p class="class-time">课程时间：周二 14:00-16：00</p>
          <div class="erl-st">报名人数：
            <ul>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
            </ul>
          </div>
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
        <li class="course-card">
          <p class="class-name">Class name</p>
          <p class="trainer-name">教练：Trainer</p>
          <p class="class-date">开班日期：2019/03/01</p>
          <p class="class-time">课程时间：周二 14:00-16：00</p>
          <div class="erl-st">报名人数：
            <ul>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
            </ul>
          </div>
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
        <li class="course-card">
          <p class="class-name">Class name</p>
          <p class="trainer-name">教练：Trainer</p>
          <p class="class-date">开班日期：2019/03/01</p>
          <p class="class-time">课程时间：周二 14:00-16：00</p>
          <div class="erl-st">报名人数：
            <ul>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
              <li>
                <img src="@/assets/user.png" alt>
              </li>
            </ul>
          </div>
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
          <i class="el-icon-circle-plus-outline plus-button" @click="clickNewCls"></i>
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
      form: {
        name: "",
        level: "",
        trainer: "",
        beginDate: "",
        startTime: "",
        endTime: "",
        deadLine: ""
      }
    };
  },

  components: {},

  computed: {},

  beforeMount() {},

  mounted() {},

  methods: {
    clickNewCls() {
      this.$router.push({ name: "ClassForm" });
    },
    onSubmit() {
      console.log("submit!");
      this.$http
        .post("http://127.0.0.1:8080/xxx", qs.stringify(this.form))
        .then(res => {
          if (res) {
            console.log(res);
          }
        })
        .catch(err => {
          console.log(err);
        });
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
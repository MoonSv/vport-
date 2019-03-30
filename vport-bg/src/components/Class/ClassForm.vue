<template>
  <div>
    <h2 style="color: rgb(46, 120, 125);">新的班级</h2>
    <br>
    <el-form ref="form" :model="form" label-width="120px" label-position="right">
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
      <el-form-item size="large">
        <el-button type="primary" @click="onSubmit">提交</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: "CourseForm",
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
  methods: {
    onSubmit() {
      console.log("submit!");
      this.$http
        .post("http://www.vport.com/rest/course_save.action", qs.stringify(this.form))
        .then(res => {
          if (res) {
            console.log(res);
          }
        })
        .catch(err => {
          console.log(err);
        });
    },
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePreview(file) {
      console.log(file);
    },
  },

  components: {},

  computed: {},

  beforeMount() {},

  mounted() {},

  watch: {}
};
</script>
<style lang='' scoped>
</style>
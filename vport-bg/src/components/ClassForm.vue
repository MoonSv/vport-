<template>
  <div>
    <el-form ref="form" :model="form" label-width="120px" label-position="right">
      <el-form-item label="课程内容">
        <el-select v-model="form.region" placeholder="请选择对应课程">
          <el-option label="S" value="S"></el-option>
          <el-option label="A" value="A"></el-option>
          <el-option label="B" value="B"></el-option>
          <el-option label="C" value="C"></el-option>
          <el-option label="D" value="D"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="班级名称">
        <el-input v-model="form.name"></el-input>
      </el-form-item>
      <el-form-item label="任课教练">
        <el-input v-model="form.trainer"></el-input>
      </el-form-item>
      <el-form-item label="开课日期">
        <el-date-picker v-model="value1" type="date" placeholder="选择日期"></el-date-picker>
      </el-form-item>
      <el-form-item label="训练时间">
        <el-time-select
          placeholder="起始时间"
          v-model="startTime"
          :picker-options="{
      start: '08:30',
      step: '00:15',
      end: '18:30'
    }"
        ></el-time-select>
        <el-time-select
          placeholder="结束时间"
          v-model="endTime"
          :picker-options="{
      start: '08:30',
      step: '00:15',
      end: '18:30',
      minTime: startTime
    }"
        ></el-time-select>
      </el-form-item>
      <el-form-item label="截止报名日期">
        <el-date-picker v-model="value1" type="date" placeholder="选择日期"></el-date-picker>
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
        region: "",
        date1: "",
        date2: "",
        delivery: false,
        type: [],
        resource: "",
        desc: "",
        fileList2: [
          {
            name: "food.jpeg",
            url:
              "https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100"
          },
          {
            name: "food2.jpeg",
            url:
              "https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100"
          }
        ]
      }
    };
  },
  methods: {
    onSubmit() {
      console.log("submit!");
    },
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePreview(file) {
      console.log(file);
    }
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
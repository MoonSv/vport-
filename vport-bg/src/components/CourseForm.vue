<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-form-item label="课程名称">
        <el-input v-model="form.courseName"></el-input>
      </el-form-item>
      <el-form-item label="课程级别">
        <el-select v-model="form.level" placeholder="请选择课程级别">
          <el-option label="S" value="S"></el-option>
          <el-option label="A" value="A"></el-option>
          <el-option label="B" value="B"></el-option>
          <el-option label="C" value="C"></el-option>
          <el-option label="D" value="D"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="最低年龄">
        <el-input-number
          v-model="form.beginAge"
          @change="handleChange"
          :min="3"
          :max="30"
          label="描述文字"
        ></el-input-number>
      </el-form-item>
      <el-form-item label="最高年龄">
        <el-input-number v-model="form.endAge" @change="handleChange" :min="50" :max="80" label="描述文字"></el-input-number>
      </el-form-item>
      <el-form-item label="收费标准">
        <el-input v-model="form.fee"></el-input>
      </el-form-item>
      <el-form-item label="课程周期">
        <el-input v-model="form.trainingPeriod"></el-input>
      </el-form-item>
      <el-form-item label="图片">
        <el-upload
          class="upload-demo"
          action="http://www.vport.com/rest/course_save.action"
          name="picUrl"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          list-type="picture"
        >
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>
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
        courseName: "",
        level: "",
        beginAge: 0,
        endAge: 0,
        fee: "",
        trainingPeriod: "",
        // fileList2: [
        //   {
        //     name: "food.jpeg",
        //     url:
        //       "https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100"
        //   },
        //   {
        //     name: "food2.jpeg",
        //     url:
        //       "https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100"
        //   }
        // ]
      }
    };
  },
  methods: {
    onSubmit() {
      console.log("submit!");
      console.log(this.form);
      this.$http
        .post("http://www.vport.com/rest/course_save.action", this.form)
        .then(res => {
          console.log(res)
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
    handleChange(value) {
      console.log(value);
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
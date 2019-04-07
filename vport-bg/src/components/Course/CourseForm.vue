<template>
  <div>
    <h2 style="color: rgb(46, 120, 125);">新的课程</h2>
    <br>
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
        <el-input-number
          v-model="form.endAge"
          @change="handleChange"
          :min="50"
          :max="80"
          label="描述文字"
        ></el-input-number>
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
          action
          name="picUrl"
          :multiple="isMultiple"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          :on-success="handleUploadSuccess"
          :file-list="form.fileList"
          :http-request="uploadImage"
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
import qs from "qs";
export default {
  name: "CourseForm",
  props: [""],
  data() {
    return {
      isMultiple: true,
      form: {
        courseName: "",
        level: "",
        beginAge: 0,
        endAge: 0,
        fee: "",
        trainingPeriod: "",
        fileList: [],
        fileListStr: ""
      }
    };
  },
  methods: {
    onSubmit() {
      console.log("submit!");
      console.log(this.form);
      this.$http
        .post(
          "http://www.vport.com/rest/course_save.action",
          qs.stringify(this.form)
        )
        .then(res => {
          console.log(res);
        })
        .catch(err => {
          console.log(err);
        });
    },
    uploadImage(param) {
      // using axios to upload image
      let formData = new FormData();
      formData.append("file", param.file);
      let config = {
        "Content-Type": "multipart/form-data"
      };
      let var_this = this;
      this.$http
        .post("http://www.vport.com/rest/fileUpload/saveFile", formData, config)
        .then(response => {
          console.log(response)
          let tmp = {
            url: response.url,
            name: param.file.name
          };
          this.form.fileListStr += response.url + ",";
          this.form.fileList.push(tmp);
          console.log("filelist")
          console.log(this.form.fileList)
          console.log('fileToString')
          console.log(this.form.fileListStr)
        })
        .catch(error => {
          console.log(error);
        });
    },
    handleUploadSuccess(response, file, fileList) {
      // console.log('response!')
      // console.log(response)
      // console.log('file')
      // console.log(file)
      let tmp = {
        url: response.url,
        name: file.name
      };
      this.form.fileListStr += response.url + ",";
      this.form.fileList.push(tmp);
      // console.log("filelist")
      // console.log(this.form.fileList)
      // console.log('fileToString')
      // console.log(this.form.fileListStr)
      console.log("!!!");
      console.log(file);
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
<style>
.upload-demo .el-upload-list {
  display: flex;
  flex-wrap: wrap;
}
.upload-demo .el-upload-list > li {
  width: 23%;
  margin-right: 10px;
}
</style>
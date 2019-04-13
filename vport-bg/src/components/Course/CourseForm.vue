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
          <el-option
            v-for="level in crsLevels"
            :key="level.id"
            :label="level.type"
            :value="level.id"
          ></el-option>
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
          action="http://www.vport.com/rest/fileUpload/saveFile"
          name="picUrl"
          :multiple="isMultiple"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          :on-success="handleUploadSuccess"
          :file-list="form.fileList"
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
        picUrl: ""
      },
      crsLevels: [
        {
          id: 1,
          type: "S"
        },
        {
          id: 2,
          type: "A"
        },
        {
          id: 3,
          type: "B"
        },
        {
          id: 4,
          type: "C"
        },
        {
          id: 5,
          type: "D"
        }
      ]
    };
  },
  methods: {
    getLevels() {
      this.$http
        .get("course/get_levels")
        .then(res => {
          console.log("course levels: ");
          console.log(res.data);
          this.crsLevels = res.data;
        })
        .catch(err => {
          console.log(res);
        });
    },
    onSubmit() {
      console.log("submit!");
      console.log(this.form);
      this.$http
        .post("course/save", qs.stringify(this.form))
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
        .post(
          "https://easy-mock.com/mock/5b7f7a284a96987699e40630/imageUpload",
          formData,
          config,
          {
            progress: function(event) {
              param.file.percent = (event.loaded / event.total) * 100;
              param.onProgress(param.file);
            }
          }
        )
        .then(response => {
          // console.log(response)
          let tmp = {
            url: response.data.url,
            name: param.file.name
          };
          // this.form.picUrl += response.data.url + ","
          this.form.fileList.push(tmp);
          this.form.picUrl = "";
          for (let i = 0; i < this.form.fileList.length; i++) {
            console.log(i);
            console.log(this.form.fileList[i]);
            this.form.picUrl += this.form.fileList[i].url + ",";
          }
          console.log("filelist");
          console.log(this.form.fileList);
          console.log("num of url: ");
          console.log(this.form.picUrl.split(",").length);
        })
        .catch(error => {
          console.log(error);
        });
    },
    handleUploadSuccess(response, file, fileList) {
      console.log("success");
      console.log(fileList);
      console.log(this.form.fileList);
      this.form.fileList = fileList;
      this.form.picUrl = "";
      for (let i = 0; i < fileList.length; i++) {
        this.form.picUrl += this.form.fileList[i].url + ",";
      }
      console.log("num of url: ");
      console.log(this.form.picUrl.split(",").length);
    },
    handleRemove(file, fileList) {
      console.log("after remove: ");
      console.log(fileList);
      this.form.fileList = fileList;
      this.form.picUrl = "";
      for (let i = 0; i < fileList.length; i++) {
        this.form.picUrl += this.form.fileList[i].url + ",";
      }
      console.log("num of url: ");
      console.log(this.form.picUrl.split(",").length);
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
<template>
  <div>
    <h2 style="color: rgb(46, 120, 125);">新的班级</h2>
    <br>
    <div>
      <el-form
        v-show="showFormChose"
        ref="form"
        :rules="rules"
        :model="form"
        label-width="120px"
        label-position="right"
        style="display: block"
      >
        <el-form-item label="班级名称">
          <el-input v-model="form.className"></el-input>
        </el-form-item>
        <el-form-item label="课程内容">
          <el-select v-model="form.course" placeholder="请选择对应课程">
            <el-option
              v-for="item in courseList"
              :key="item.id"
              :label="item.courseName"
              :value="item.id"
            >
              <span style="float: left">{{ item.courseName }}</span>
              <span style="float: right; color: #8492a6; font-size: 13px">{{ item.level.levelName }}</span>
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="训练地点">
          <el-select v-model="form.trainingPlaceId" placeholder="请选择训练地点" style="margin: 0px auto">
            <el-option
              v-for="item in trainingPlace"
              :key="item.id"
              :label="item.address"
              :value="item.id"
            >
              <span style="float: left">{{ item.address }}</span>
              <span style="float: right; color: #8492a6; font-size: 13px">{{ item.id }}</span>
            </el-option>
          </el-select>
        </el-form-item>
        <!-- <el-form-item label="任课教练">
        <el-select v-model="form.trainer" placeholder="请选择教练">
          <el-option label="教练A" value="教练A"></el-option>
          <el-option label="教练B" value="教练B"></el-option>
          <el-option label="教练C" value="教练C"></el-option>
          <el-option label="教练D" value="教练D"></el-option>
          <el-option label="教练E" value="教练E"></el-option>
        </el-select>
        </el-form-item>-->
        <!-- <el-form-item>
        <el-date-picker
          v-model="value1"
          type="datetimerange"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          size="large"
          :time-arrow-control="true"
          :picker-options="pickerOptions"
        >></el-date-picker>
      </el-form-item>
      <el-form-item label="开课日期">
        <el-date-picker v-model="form.beginDate" type="date" placeholder="选择日期"></el-date-picker>
      </el-form-item>
      <el-form-item label="训练时间" style="display: none">
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
        </el-form-item>-->
        <el-form-item label="课程周期">
          <el-input v-model="form.trainingPeriod"></el-input>
        </el-form-item>
        <el-form-item label="截止报名日期">
          <el-date-picker v-model="form.deadLine" type="date" placeholder="选择日期"></el-date-picker>
        </el-form-item>
        <el-form-item size="large" style="display: none">
          <el-button type="primary" @click="onSubmit">提交</el-button>
        </el-form-item>
        <el-form-item size="large" style="display: none">
          <el-button type="primary" @click="onSubmit">下一步</el-button>
        </el-form-item>
        <el-form-item size="large" style="display: block">
          <button class="dialog-button" style="margin: 0" @click="showDate">下一步</button>
        </el-form-item>
      </el-form>
      <div v-show="showDateChose">
        <div class="time-select">
          <div class="date-part" :class="{ active: dayIndex === 1 }">
            <div class="date-part-title">Monday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['1']"
                  :key="index"
                  :class="{ active: '1-'+index === targetIndex}"
                  @click="onClickSlot('1-'+index, 1, item)"
                >{{item}}</li>
                <!-- <li @click="onClickSlot" :class="{ deactive: !isLiActive }">08:00 - 10:00</li>
            <li @click="onClickSlot" :class="{ deactive: !isLiActive }">14:00 - 16:00</li>
                <li @click="onClickSlot" :class="{ deactive: !isLiActive }">16:00 - 18:00</li>-->
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 2 }">
            <div class="date-part-title">Tuesday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['2']"
                  :key="index"
                  :class="{ active: '2-'+index === targetIndex}"
                  @click="onClickSlot('2-'+index, 2, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 3 }">
            <div class="date-part-title">Wednesday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['3']"
                  :key="index"
                  :class="{ active: '3-'+index === targetIndex}"
                  @click="onClickSlot('3-'+index, 3, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 4 }">
            <div class="date-part-title">Thurday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['4']"
                  :key="index"
                  :class="{ active: '4-'+index === targetIndex}"
                  @click="onClickSlot('4-'+index, 4, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 5 }">
            <div class="date-part-title">Friday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['5']"
                  :key="index"
                  :class="{ active: '5-'+index === targetIndex}"
                  @click="onClickSlot('5-'+index, 5, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 6 }">
            <div class="date-part-title">Saturday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['6']"
                  :key="index"
                  :class="{ active: '6-'+index === targetIndex}"
                  @click="onClickSlot('6-'+index, 6, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
          <div class="date-part" :class="{ active: dayIndex === 7 }">
            <div class="date-part-title">Sunday</div>
            <div class="time-slot-wrapper">
              <ul class="time-slot">
                <li
                  v-for="(item, index) in availableTime['7']"
                  :key="index"
                  :class="{ active: '7-'+index === targetIndex}"
                  @click="onClickSlot('7-'+index, 7, item)"
                >{{item}}</li>
              </ul>
            </div>
          </div>
        </div>
        <div class="btn-group">
          <button class="dialog-button" @click="showForm">上一步</button>
          <button class="dialog-button" @click="showTrainer">下一步</button>
        </div>
      </div>
      <el-dialog title="训练时间" :visible.sync="centerDialogVisible" width="40%" center>
        <div class="selectGroup">
          <el-time-select
            placeholder="起始时间"
            v-model="form.startTime"
            :picker-options="dialogPickOptStart"
            :default-value="defaultDialogStart"
            :start-placeholder="defaultDialogStart"
          ></el-time-select>
          <el-time-select
            placeholder="结束时间"
            v-model="form.endTime"
            :picker-options="dialogPickOptEnd"
            :default-value="defaultDialogEnd"
          ></el-time-select>
        </div>
        <button class="dialog-button" @click="clickDialogBtn">确认</button>
      </el-dialog>
      <div v-show="showTrainerChose">
        <div class="show-trainer">
          <div>
            <p>主教练</p>
            <el-select
              v-model="form.activeChiefTrainer.id"
              placeholder="请选择主教练"
              style="margin: 10px auto"
            >
              <el-option
                v-for="item in availableTrainers"
                :key="item.value"
                :label="item.label"
                :value="item.value"
              >
                <span style="float: left">{{ item.label }}</span>
                <span style="float: right; color: #8492a6; font-size: 13px">{{ item.value }}</span>
              </el-option>
            </el-select>
          </div>
          <div>
            <p>副教练</p>
            <el-select
              v-model="form.assistantTrainers"
              multiple
              placeholder="请选择副教练（可多选）"
              style="margin: 10px auto"
            >
              <el-option
                v-for="item in availableTrainers"
                :key="item.value"
                :label="item.label"
                :value="item.value"
              >
                <span style="float: left">{{ item.label }}</span>
                <span style="float: right; color: #8492a6; font-size: 13px">{{ item.value }}</span>
              </el-option>
            </el-select>
          </div>
        </div>
        <div class="btn-group" style="margin-top: 90px;">
          <button class="dialog-button" @click="showDate">上一步</button>
          <button class="dialog-button" @click="onSubmit('form')">提交</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import qs from "qs";
export default {
  name: "CourseForm",
  props: [""],
  data() {
    return {
      targetIndex: "0-0",
      dayIndex: 0,
      centerDialogVisible: false,
      isLiActive: false,
      startTime: "",
      endTime: "",
      pickerOptions: {
        disabledDate(time) {
          return (
            time.getTime() < Date.now() - 8.64e7 ||
            time.getTime() > Date.now() + 2592000000
          );
        }
      },
      trainingPlace: [
        { id: 123, address: "国家体育馆" },
        { id: 456, address: "水立方" }
      ],
      courseList: [],
      form: {
        className: "",
        level: "",
        trainingPlaceId: "",
        activeChiefTrainer: {
          id: ""
        },
        dayOfTraining: "",
        trainingTime: "",
        assistantTrainers: [],
        // beginDate: "",
        startTime: "",
        endTime: "",
        deadLine: "",
        trainingPeriod: ""
      },
      rules: {
        name: [
          { required: true, message: "请输入活动名称", trigger: "blur" },
          { min: 3, max: 5, message: "长度在 3 到 5 个字符", trigger: "blur" }
        ],
        level: [
          { required: true, message: "请选择课程级别", trigger: "change" }
        ],
        trainer: [
          {
            required: true,
            message: "请选择课程级别",
            trigger: "change"
          }
        ],
        startTime: [
          {
            type: "date",
            required: true,
            message: "请选择开始时间",
            trigger: "change"
          }
        ],
        endTime: [
          {
            type: "date",
            required: true,
            message: "请选择结束时间",
            trigger: "change"
          }
        ],
        deadLine: [
          {
            type: "date",
            required: true,
            message: "请选择截止时间",
            trigger: "change"
          }
        ],
        trainingPeriod: [
          { required: true, message: "请填写课程周期", trigger: "blur" }
        ]
      },
      showFormChose: true,
      showDateChose: false,
      showTrainerChose: false,
      value1: [],
      availableTime: {
        // "1": [["06:00", "12:00"], ["14:00", "16:00"], ["18:00", "22:00"]],
        // "2": [["06:00", "13:00"], ["15:00", "22:00"]],
        // "3": [["06:00", "11:00"], ["13:00", "22:00"]],
        // "4": [["06:00", "18:00"], ["20:00", "22:00"]],
        // "5": [["06:00", "22:00"]],
        // "6": [["06:00", "22:00"]],
        // "7": [["06:00", "22:00"]]
      },
      availableTrainers: [
        {
          value: "z712342",
          label: "玛丽亚"
        },
        {
          value: "z383451",
          label: "王思宇"
        },
        {
          value: "z123432",
          label: "美国队长"
        },
        {
          value: "z984723",
          label: "惊奇队长"
        },
        {
          value: "z636472",
          label: "黑山"
        },
        {
          value: "z5974234",
          label: "土肥圆"
        }
      ],
      dialogPickOptStart: {
        start: "08:30",
        step: "01:00",
        end: "18:30"
      },
      defaultDialogStart: "",
      defaultDialogEnd: ""
    };
  },
  methods: {
    // item: "06:00-22:00"
    onClickSlot(i, j, item) {
      // 先判断是否和上次打开的是一个dialog, 如果不是则清空选择时间
      if (this.targetIndex !== i) {
        this.form.startTime = "";
        this.form.endTime = "";
      }
      this.targetIndex = i;
      this.dayIndex = j;
      this.form.dayOfTraining = this.dayIndex;

      // 处理dialog时间区域
      this.dialogPickOptStart.start = item.split("-")[0];
      this.dialogPickOptStart.end = item.split("-")[1];
      this.startTime = item.split("-")[0];
      this.endTime = item.split("-")[1];
      // 处理打开dialog后的default value
      this.defaultDialogStart = this.dialogPickOptStart.start;
      this.defaultDialogEnd = this.startTime;
      console.log("defaultStart");
      console.log(this.defaultDialogStart);
      this.centerDialogVisible = true;
    },
    clickDialogBtn() {
      this.centerDialogVisible = false;
      this.form.trainingTime = this.form.startTime + "-" + this.form.endTime;
    },
    showForm() {
      this.showFormChose = true;
      this.showDateChose = false;
      this.showTrainerChose = false;
    },
    showDate() {
      this.getAvailableDate(this.form.trainingPlaceId);
      this.showFormChose = false;
      this.showDateChose = true;
      this.showTrainerChose = false;
    },
    showTrainer() {
      this.getAvailableTrainer(this.form.trainingPlaceId);
      this.showFormChose = false;
      this.showDateChose = false;
      this.showTrainerChose = true;
    },
    onSubmit(formName) {
      console.log(this.form);
      let validateFlag = true;
      for (let key in this.form) {
        if (this.form[key].length === 0) {
          validateFlag = false;
        }
      }
      if (validateFlag === true) {
        this.$refs[formName].validate(valid => {
          if (valid) {
            console.log("submit!");
            console.log(this.form);
            this.$http
              .post("/trainingClass/saveNewClass", qs.stringify(this.form))
              .then(res => {
                if (res) {
                  console.log(res);
                  this.$message({
                    message: "保存成功",
                    type: "success"
                  });
                }
              })
              .catch(err => {
                console.log(err);
              });
          } else {
            console.log("error submit!!");
            return false;
          }
        });
      } else {
        this.$message({
          message: "请填写完整提交信息",
          type: "warning"
        });
      }
    },
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePreview(file) {
      console.log(file);
    },
    getCourseList() {
      this.$http
        .get("/course/list")
        .then(res => {
          // todo, 判断返回状态
          this.courseList = res.data;
        })
        .catch(err => {
          console.log(err);
        });
    },
    getTrainingPlace() {
      this.$http
        .get("/trainingClass/getTrainingPlace")
        .then(res => {
          // todo, 判断返回状态
          this.trainingPlace = res.data;
        })
        .catch(err => {
          console.log(err);
        });
    },
    getAvailableDate(trainingPlaceId) {
      this.$http
        .get(
          `/trainingClass/getAvaliableTrainingTime?trainingPlaceId=${trainingPlaceId}`
        )
        .then(res => {
          // todo, 判断返回状态
          this.availableTime = res.data;
          // 转换显示效果
          this.transAvailableTime1(this.availableTime);
        })
        .catch(err => {
          console.log(err);
          this.transAvailableTime1(this.availableTime);
        });
    },
    // /trainingClass/getAvailableTrainer
    getAvailableTrainer(trainingDay, trainingTime) {
      this.$http
        .get("/trainingClass/getAvaliableTrainer", {
          params: {
            dayAndTime: {
              // todo
              trainingDay: trainingDay,
              trainingTime: trainingTime
            }
          }
        })
        .then(res => {
          // todo, 判断返回状态
          this.trainingPlace = res.data;
        })
        .catch(err => {
          console.log(err);
        });
    },
    transAvailableTime(TimeJson) {
      let formatJson = {};
      for (let key in TimeJson) {
        let tmp = [];
        if (TimeJson[key].length !== 0) {
          for (let i = 0; i < TimeJson[key].length; i++) {
            let start = parseInt(TimeJson[key][i][0].split(":")[0]);
            let end = parseInt(TimeJson[key][i][1].split(":")[0]);
            console.log(start, end);
            for (let j = start; j < end; j++) {
              let tmpStart = j >= 10 ? j + ":00" : "0" + j + ":00";
              let tmpEnd = j + 1 >= 10 ? j + 1 + ":00" : "0" + (j + 1) + ":00";
              let unitPeriod = tmpStart + " - " + tmpEnd;
              tmp.push(unitPeriod);
            }
          }
          formatJson[key] = tmp;
        } else {
          formatJson[key] = TimeJson[key];
        }
      }
      this.availableTime = formatJson;
    },
    transAvailableTime1(TimeJson) {
      let formatJson = {};
      for (let key in TimeJson) {
        let tmp = [];
        if (TimeJson[key].length !== 0) {
          for (let i = 0; i < TimeJson[key].length; i++) {
            let unitPeriod = TimeJson[key][i][0] + " - " + TimeJson[key][i][1];
            tmp.push(unitPeriod);
          }
          formatJson[key] = tmp;
        } else {
          formatJson[key] = TimeJson[key];
        }
      }
      this.availableTime = formatJson;
    }
  },

  components: {},

  computed: {
    dialogPickOptEnd: function() {
      let tmp = {
        start: this.startTime,
        step: "01:00",
        end: this.endTime,
        minTime: this.form.startTime
      };
      return tmp;
    }
  },

  beforeMount() {
    // this.transAvailableTime1(this.availableTime);
    this.getTrainingPlace();
    this.getCourseList();
    console.log(this.availableTime);
  },

  mounted() {},

  watch: {},
  created() {}
};
</script>
<style lang='' scoped>
.time-select {
  padding: 5px;
  display: flex;
  justify-content: space-around;
}
.date-part {
  width: 13%;
  /* height: 550px; */
  border-radius: 5px;
  text-align: center;
  color: #fff;
  background-color: rgb(139, 194, 176);
  /* border: 1px solid green; */
  padding: 3px 0px;
  transition: all 0.2s;
}
.date-part.active {
  background-color: rgb(46, 109, 103);
}
.date-part .date-part-title {
  font-weight: 700;
  margin: 10px 0;
}
.date-part:hover {
  background-color: rgb(126, 177, 170);
}
.time-slot-wrapper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  overflow: scroll;
  height: 450px;
}
.time-slot-wrapper > .time-slot {
  margin-top: -20px;
}
.time-slot-wrapper > .time-slot > li {
  border-radius: 5px;
  cursor: pointer;
  padding: 10px 0;
  margin: 3px 0;
  background-color: rgb(89, 134, 134);
  transition: all 0.2s;
}
.time-slot-wrapper > .time-slot > li:hover {
  background-color: rgb(175, 85, 69);
}
.time-slot-wrapper > .time-slot > li.active {
  background-color: rgb(175, 85, 69);
}
.selectGroup {
  display: flex;
  flex-direction: row;

  justify-content: space-around;
}
.dialog-button {
  margin: 20px auto 0;
  padding: 10px 25px;
  background-color: rgb(46, 109, 103);
  color: #fff;
  font-weight: bold;
  border: none;
  border-radius: 10px;
  display: block;
  transition: all 0.2s;
}
.dialog-button:hover {
  background-color: rgb(78, 179, 140);
}
.btn-group {
  margin: 0 auto;
  display: flex;
  justify-content: center;
}
.show-trainer {
  margin-top: 70px;

  /* display: flex; */
  /* flex-direction: column; */
  justify-content: center;
  text-align: center;
  align-items: center;
  font-size: 14px;
  color: #606266;
  line-height: 40px;
}
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s;
}
.fade-enter, .fade-leave-to /* .fade-leave-active below version 2.1.8 */ {
  opacity: 0;
}
/* .time-slot-wrapper > .time-slot > li.deactive{
  background-color: rgb(89, 134, 134);
} */
</style>
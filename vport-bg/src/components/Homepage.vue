<template>
  <div>
    <el-container style="height: 100vh; border: 1px solid #eee">
      <el-aside width="180px" style="background-color: rgb(238, 241, 246)">
        <el-menu :default-openeds="['1', '2', '3']">
          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-goods"></i>课程
            </template>
            <el-menu-item-group>
              <!-- <template slot="title">分组一</template> -->
              <el-menu-item index="1-1" @click="clickNewCrs">
                <i class="el-icon-circle-plus-outline"></i>新增课程
              </el-menu-item>
              <el-menu-item index="1-2" @click="clickNewCls">
                <i class="el-icon-circle-plus-outline"></i>新增班级
              </el-menu-item>
              <el-menu-item index="1-3" >
                <i class="el-icon-search"></i>浏览课程
              </el-menu-item>
              <el-menu-item index="1-4" @click="clickClsList">
                <i class="el-icon-tickets"></i>浏览班级
              </el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title">
              <i class="el-icon-goods"></i>商城
            </template>
            <el-menu-item-group>
              <!-- <template slot="title">分组一</template> -->
              <el-menu-item index="2-1" @click="clickNewGood">
                <i class="el-icon-circle-plus-outline"></i>新增商品
              </el-menu-item>
              <el-menu-item index="2-2">
                <i class="el-icon-search"></i>浏览商品
              </el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <i class="el-icon-bell"></i>社区
            </template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="3-1">选项1</el-menu-item>
              <el-menu-item index="3-2">选项2</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="分组2">
              <el-menu-item index="3-3">选项3</el-menu-item>
            </el-menu-item-group>
            <el-submenu index="3-4">
              <template slot="title">选项4</template>
              <el-menu-item index="3-4-1">选项4-1</el-menu-item>
            </el-submenu>
          </el-submenu>
        </el-menu>
      </el-aside>

      <el-container>
        <el-header style="text-align: right; font-size: 12px">
          <span class="title">Vport 后台管理</span>
          <el-dropdown>
            <i class="el-icon-setting" style="margin-right: 15px"></i>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>查看</el-dropdown-item>
              <el-dropdown-item>新增</el-dropdown-item>
              <el-dropdown-item>删除</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <span>王小虎</span>
        </el-header>

        <el-main>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "",
  props: [""],
  data() {
    return {};
  },

  components: {},

  computed: {},

  beforeMount() {},

  mounted() {},

  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    clickNewCrs() {
      this.$router.push({ name: "CourseForm" });
    },
    clickNewCls() {
      this.$router.push({ name: "ClassForm" });
    },
    clickNewGood() {
      this.$router.push({ name: "CourseForm" });
    },
    clickClsList() {
        console.log(11)
      this.$router.push({ name: "CourseList" });
    }
  },

  watch: {}
};
</script>
<style lang='' scoped>
.el-header {
  background-color: #b3c0d1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
.title {
  text-align: left;
  float: left;
  font-size: 19px;
  font-weight: bold;
  color: #505050;
}
</style>
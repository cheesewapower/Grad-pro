<template>
  <div class="login" @keydown.enter="handleSubmit">
    <div class="login-con">
      <Card :bordered="false">
        <p slot="title">
          <Icon type="log-in"></Icon>
          欢迎登录管理系统
        </p>
        <div class="form-con">
          <Form ref="form" :model="form" :rules="rules">
            <FormItem prop="username">
              <Input v-model="form.username" placeholder="请输入用户名"/>
              <span slot="prepend">
                                    <Icon :size="16" type="person"></Icon>
                                </span>
              </Input>
            </FormItem>
            <FormItem prop="password">
              <Input type="password" v-model="form.password" placeholder="请输入密码"/>
              <span slot="prepend">
                                    <Icon :size="14" type="locked"></Icon>
                                </span>
              </Input>
            </FormItem>
            <FormItem>
              <router-link to="/">  <Button  type="primary" long>登录</Button></router-link>
            </FormItem>
          </Form>
        </div>
      </Card>
    </div>
  </div>
</template>

<script>
  //import Cookies from 'js-cookie';
  export default {
    name: 'login',
    data() {
      return {
        form: {
          username: '',
          password: '',
          type: 1
        },
        rules: {
          username: [
            {required: true, message: '账号不能为空', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '密码不能为空', trigger: 'blur'}
          ]
        }
      };
    },
    methods: {
      handleSubmit() {
        var that = this;
        this.$refs.form.validate((valid) => {
          if (valid) {

          }
        });
      }
    }
  };
</script>


<style scoped lang="less">
  .login {
    width: 100%;
    height: 100%;
    background-image: url('../assets/login_back.jpg');
    background-size: cover;
    background-position: center;
    position: relative;
    &-con {
      position: absolute;
      right: 160px;
      top: 50%;
      transform: translateY(-60%);
      width: 300px;
      &-header {
        font-size: 16px;
        font-weight: 300;
        text-align: center;
        padding: 30px 0;
      }
      .form-con {
        padding: 10px 0 0;
      }
      .login-tip {
        font-size: 10px;
        text-align: center;
        color: #c3c3c3;
      }
    }
  }
</style>

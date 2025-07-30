// 官网: https://www.axios-http.cn/docs/intro
import axios from "axios";


// config配置参数参考: https://www.axios-http.cn/docs/req_config
const config = {
  baseURL: 'http://localhost:8080', // 请求地址
  timeout: 15000, // 请求超时时间(ms)
  withCredentials: true,
};

// axios实例api参考: https://www.axios-http.cn/docs/instance
const axios_instance = axios.create(config);


// 请求响应结构参考: https://www.axios-http.cn/docs/res_schema
axios_instance.interceptors.response.use(
    (res) => {
      if (res.status != 200)
        console.log("响应状态码")

      return res;
    },
    (err) => {
      console.log("错误发生: ", err)
    },
);

export default axios_instance;

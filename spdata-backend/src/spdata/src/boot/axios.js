import Vue from 'vue'
import axios from 'axios'

let axiosInstance = axios
if (process.env.NODE_ENV != 'production') {
    console.log('is not production')
    axiosInstance = axios.create({
        baseURL: 'http://localhost:8080'
    });
} else {
    const host = location.origin
    const context = location.pathname.split('/')

    console.log('is production', host + '/' + context[1])
    axiosInstance = axios.create({
        baseURL: host + '/' + context[1]
    });
}


Vue.prototype.$axios = axiosInstance

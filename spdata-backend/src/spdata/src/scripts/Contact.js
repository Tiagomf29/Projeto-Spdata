import Vue from "vue";
import Notifier from './NotifyService.js'
class ContactService {
    getAssuntos() {
        return Vue.prototype.$axios.get('/assunto/listarTodos')
            .then(res => {
                return res.data;
            })
            .catch(e => {
                const notifier = new Notifier()
                notifier.error(e.message)
            })
    }

    send(payload) {
        const notifier = new Notifier()
        return Vue.prototype.$axios.post('/contato/criarContato', payload).then((response) => {
            notifier.success(response.data)
        }).catch(e => {
            console.log(e.response.data.mensagem)
            notifier.error(e.response.data.mensagem)
        })
    }
}
export default ContactService;
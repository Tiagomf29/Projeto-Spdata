<template>
  <div class="q-pa-md">
    <q-form @submit="onSubmit" @reset="onReset" class="q-gutter-md">
      <div class="flex item-container">
        <q-input
          class="row item"
          filled
          v-model="nome"
          label="Nome"
          hint="Nome e sobrenome"
          lazy-rules
          :rules="[ val => val && val.length > 0 || 'Por favor, preencha com seu nome']"
        />

        <div>
          <q-input
            class="row item"
            filled
            v-model="email"
            label="Email"
            hint="Exemplo: luke@skywalker.com.br"
            lazy-rules
            :rules="[ val => val && val.length > 0 || 'Por favor, preencha com seu email']"
          />
        </div>
      </div>
      <div class="flex item-container">
        <q-input
          filled
          class="row item"
          v-model="confirmacao_email"
          label="Confirmação do email"
          hint="Exemplo: darth@vader.com.br"
          lazy-rules
          :rules="[ val => val && val.length > 0 || 'Por favor, confirme seu email']"
        />
        <q-input
          filled
          class="row item"
          v-model="telefone"
          label="Phone"
          mask="(##) ##### - ####"
          hint="Exemplo: (33) 3333 - 3333"
        />
      </div>
      <div class="flex item-container">
        <q-input
          filled
          class="row item"
          v-model="empresa"
          label="Empresa"
          hint="Nome da empresa em que você trabalha"
          lazy-rules
          :rules="[ val => val && val.length > 0 || 'Por favor, preencha com sua empresa']"
        />

        <q-input
          filled
          class="row item"
          v-model="cargo"
          label="Cargo"
          hint="O cargo que você ocupa, ex: enfermeiro"
          lazy-rules
          :rules="[ val => val && val.length > 0 || 'Por favor, preencha com seu cargo']"
        />
      </div>
      <div class="flex item-container">
        <q-input
          filled
          class="row item"
          v-model="endereco"
          label="Endereço"
          hint="Seu endereço, ex: Rua Vasco da Gama, nº 178"
          lazy-rules
          :rules="[ val => val && val.length > 0 || 'Por favor, preencha com seu cargo']"
        />
        <q-select
          filled
          class="row item"
          v-model="assunto"
          hint="Sugestões, Currículos, Críticas..."
          multiple
          :options="options"
          label="Assunto"
        />
      </div>
      <q-input class="message" v-model="mensagem" filled type="textarea" />

      <div>
        <q-btn label="Enviar" type="submit" color="primary" />
        <q-btn label="Limpar campos" type="reset" color="primary" flat class="q-ml-sm" />
      </div>
    </q-form>
  </div>
</template>

<script>
import contactService from "../scripts/Contact";
import Notifier from "../scripts/NotifyService";
export default {
  data() {
    return {
      nome: null,
      email: null,
      confirmacao_email: null,
      telefone: null,
      empresa: null,
      cargo: null,
      endereco: null,
      assunto: [],
      mensagem: null,
      notifier: new Notifier(),
      options: [],
      contactService: new contactService()
    };
  },
  methods: {
    onSubmit() {
      if (this.email !== this.confirmacao_email) {
        this.notifier.info("Os emails devem coincidir");
      } else {
        let telefonePayload = this.telefone.replace("(", "");
        telefonePayload = telefonePayload.replace(")", "");
        telefonePayload = telefonePayload.replace("-", "");
        telefonePayload = telefonePayload.replace(/\s/g, '');
        const payload = {
          nome: this.nome,
          email: this.email,
          telefone: telefonePayload,
          nomeEmpresa: this.empresa,
          cargo: this.cargo,
          endereco: this.endereco,
          mensagem: this.mensagem,
          listaAssuntos: this.assunto
        };

        console.log("enviando", payload);
        this.contactService.send(payload);
      }
    },
    onReset() {
      this.nome = null;
      this.email = null;
      this.confirmacao_email = null;
      this.telefone = null;
      this.empresa = null;
      this.cargo = null;
      this.endereco = null;
      this.assunto = null;
      this.mensagem = null;
    }
  },
  mounted() {
    this.contactService.getAssuntos().then(res => {
      res.forEach(el => {
        const op = {
          value: el.id,
          label: el.descricao,
          assunto: el
        };
        this.options.push(op);
      });
    });
  }
};
</script>

<style>
</style>
<template>
  <q-layout view="lHh Lpr lFf">
    <q-header id="header" class="bg-gradient" elevated>
      <q-toolbar>
        <div id="logo" class="logo-2-basis">
          <img src="~assets/logo2.png" alt="logotipo spdata" />
        </div>

        <q-list :v-if="!mobile()" id="links-header" class="links-header">
          <q-item class="link-header" clickable @click="redirect('/')">Home</q-item>
          <q-item class="link-header" clickable>Empresa</q-item>
          <q-item class="link-header" clickable>Soluções</q-item>
          <q-item class="link-header" clickable>Módulos</q-item>
          <q-item class="link-header" clickable>Serviços</q-item>
          <q-item class="link-header" clickable>Cursos</q-item>
          <q-item class="link-header" clickable>Portarias</q-item>
          <q-item class="link-header" clickable>Blog</q-item>
          <q-item class="link-header" clickable>Contato</q-item>
        </q-list>
        <!-- <q-btn
          :v-if="mobile()"
          class="links-header"
          label="Fit Menu"
          style="width: 280px;"
        >
          <q-menu fit>
            <q-list style="min-width: 100px">
              <q-item clickable>
                <q-item-section>Home</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Empresa</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Soluções</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Módulos</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Serviços</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Cursos</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Portarias</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Blog</q-item-section>
              </q-item>
              <q-item clickable>
                <q-item-section>Contato</q-item-section>
              </q-item>
            </q-list>
          </q-menu>
        </q-btn> -->
      </q-toolbar>
    </q-header>

    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
export default {
  name: "MainLayout",

  data() {
    return {
      leftDrawerOpen: false
    };
  },
  methods: {
    redirect(page) {
      this.$router.push(page);
    },
    mobile() {
      if (window.innerWidth <= 425) {
        return true;
      } else {
        return false;
      }
    }
  }
};
</script>

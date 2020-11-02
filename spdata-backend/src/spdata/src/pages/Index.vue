<template>
  <q-page class="flex flex-center">
    <div class="logoInternalContainer">
      <img class="animated" alt="SPDATA logo" src="~assets/logo.png" />
    </div>

    <div class="contact">
      <q-btn @click="contact()" icon="local_phone" color="primary" text-color="white" round></q-btn>
    </div>

    <div class="content">
      <div class="primary-view">
        <q-card class="my-card-1">
          <q-parallax src="~assets/gente-estrangeira-feliz.jpg" :height="150" />

          <q-card-section>
            <div class="text-h6">Soluções práticas e personalizadas</div>
            <div class="text-subtitle2">Suporte completo atenciosamente, sempre ao seu lado</div>
          </q-card-section>
        </q-card>

        <div class="right-content">
          <q-card class="my-card-2">
            <q-parallax src="~assets/gente-estrangeira-feliz-2.png" :height="150" />

            <q-card-section>
              <div class="text-h6 justify-end">Uma marca que tem muito de você</div>
              <div class="text-subtitle2 justify-end">Soluções integradas em saúde</div>
            </q-card-section>
          </q-card>
        </div>
      </div>

      <div class="second-view">
        <div class="second-header">
          <div class="text-h6 justify-center font-color-2">Sistemas de gestão para saúde</div>
        </div>

        <div class="content-2">
          <q-card class="my-card">
            <q-img src="~assets/professionalism.png" basic>
              <div class="absolute-bottom text-h6">Solicite uma demonstração</div>
            </q-img>

            <q-card-section>{{ content_2_text_body }}</q-card-section>
          </q-card>
        </div>
      </div>

      <div class="thirdy-view">
        <div class="thirdy-view-title">
          <div class="text-h6 font-color-2 thirdy-view-title-content">Nossos produtos</div>
        </div>
        <div class="thirdy-view-content">
          <div class="carousel-container">
            <q-carousel
              v-model="slide"
              transition-prev="slide-right"
              transition-next="slide-left"
              swipeable
              animated
              control-color="primary"
              navigation
              padding
              arrows
              class="bg-grey-1 shadow-2 rounded-borders"
            >
              <q-carousel-slide :name="1" class="column no-wrap">
                <div class="row fit justify-start items-center q-gutter-xs q-col-gutter no-wrap">
                  <q-card class="carousel-card">
                    <img src="~assets/sgh.jpeg" />

                    <q-card-section>
                      <div class="text-h6">SGH</div>
                      <div class="text-subtitle2">Sistema de Gestão Hospitalar</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                  <q-card class="carousel-card">
                    <img src="~assets/sgo.jpeg" />

                    <q-card-section>
                      <div class="text-h6">SGO</div>
                      <div class="text-subtitle2">S. de Gestão de Operadoras de Saúde</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                </div>
              </q-carousel-slide>
              <q-carousel-slide :name="2" class="column no-wrap">
                <div class="row fit justify-start items-center q-gutter-xs q-col-gutter no-wrap">
                  <q-card class="carousel-card">
                    <img src="~assets/sgsp.jpeg" />

                    <q-card-section>
                      <div class="text-h6">SGSP</div>
                      <div class="text-subtitle2">Sistema de Gestão de Saúde Pública</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                  <q-card class="carousel-card">
                    <img src="~assets/pep.jpeg" />

                    <q-card-section>
                      <div class="text-h6">PEP</div>
                      <div class="text-subtitle2">Prontuário Eletrônico do Paciente</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                </div>
              </q-carousel-slide>
              <q-carousel-slide :name="3" class="column no-wrap">
                <div class="row fit justify-start items-center q-gutter-xs q-col-gutter no-wrap">
                  <q-card class="carousel-card">
                    <img src="~assets/sgh-intelligence.jpeg" />

                    <q-card-section>
                      <div class="text-h6">SGH-Intelligence</div>
                      <div class="text-subtitle2">Sistema de Gestão Hospitalar - BI</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                  <q-card class="carousel-card">
                    <img src="~assets/sgh-suprimentos.jpeg" />

                    <q-card-section>
                      <div class="text-h6">SGH-Suprimentos</div>
                      <div class="text-subtitle2">S. de Gestão Hospitalar - Suprimentos</div>
                    </q-card-section>

                    <q-card-section class="q-pt-none">Saiba mais</q-card-section>
                  </q-card>
                </div>
              </q-carousel-slide>
            </q-carousel>
          </div>
        </div>
      </div>
      <div class="fourty-view">
        <div class="thirdy-view-title">
          <div class="text-h6 font-color-2 thirdy-view-title-content">Cases</div>
        </div>
        <div class="fourty-view-cards">
          <q-card class="my-card" flat bordered>
            <q-parallax
              src="https://politica.estadao.com.br/blogs/crop/1200x900/fausto-macedo/wp-content/uploads/sites/41/2016/08/santa-casa-sao-sebastiao-paraiso.jpg?xcd_image_optimization=false"
              :height="500"
            />

            <q-card-section>
              <div class="text-overline text-orange-9">Santa Casa de Paraíso</div>
              <div class="text-h5 q-mt-sm q-mb-xs">Naiara Cristina Moraes</div>
              <div
                class="text-caption text-grey"
              >É bastante interessante participar do curso de capacitação, pois para mim o sistema é novo, haja vista, que assumi recentemente o cargo de gestora de TI, com certeza é um grande investimento profissional.</div>
            </q-card-section>
          </q-card>

          <q-card class="my-card fourty-view-card-2" flat bordered>
            <q-parallax
              src="https://1.bp.blogspot.com/-3wnH8g9Eqtk/V-pbKFL5fyI/AAAAAAAAKP4/ZmrWhSZ4sSA9L1cxcWtte2ZMUYU4vSJmACLcB/s1600/HNSD-fachada.jpg"
              :height="500"
            />
            <q-card-section>
              <div class="text-overline text-orange-9">Hospital Nossa Senhora das Dores</div>
              <div class="text-h5 q-mt-sm q-mb-xs">Welisson Geraldo dos Reis</div>
              <div
                class="text-caption text-grey"
              >O Software de Gestão Hospitalar da SPDATA é um ferramenta indispensável para gerir/administrar uma instituição de saúde com foco voltado para os processos institucionais. Outro ponto forte da empresa é o SAC que é nota 10.</div>
            </q-card-section>
          </q-card>
        </div>
        <div class="fourty-view-cards">
          <q-card class="my-card" flat bordered>
            <q-parallax
              src="https://s2.glbimg.com/ZcGJOKHqluKI-tEyUgHfvr4u4HU=/0x0:800x450/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2017/S/u/AMwyB5SAiWXip9jBEOlw/hnsc.jpg"
              :height="500"
            />

            <q-card-section>
              <div
                class="text-overline text-orange-9"
              >Hospital Nossa Sra da Conceição de Para de Minas</div>
              <div class="text-h5 q-mt-sm q-mb-xs">Renato Melo</div>
              <div
                class="text-caption text-grey"
              >Todo Gestor precisa de muitas informações no seu dia a dia. E o sistema SPDATA é referência como fonte de informações gerenciais para a tomada das decisões.</div>
            </q-card-section>
          </q-card>

          <q-card class="my-card fourty-view-card-2" flat bordered>
            <q-parallax
              src="https://extra.globo.com/incoming/11086522-a77-8ec/w976h550-PROP/hospital-nossa-senhora-das-dores.jpg"
              :height="500"
            />
            <q-card-section>
              <div class="text-overline text-orange-9">Hospital Nossa Senhora das Dores</div>
              <div class="text-h5 q-mt-sm q-mb-xs">Welisson Geraldo dos Reis</div>
              <div
                class="text-caption text-grey"
              >O Software de Gestão Hospitalar da SPDATA é um ferramenta indispensável para gerir/administrar uma instituição de saúde com foco voltado para os processos institucionais. Outro ponto forte da empresa é o SAC que é nota 10.</div>
            </q-card-section>
          </q-card>
        </div>
      </div>
      <div class="footer flex">
        <div class="social-midia text-bold">
          <div class="social-midia-title">
            Redes sociais
          </div>
          <div class="social-midia-content">
            <div class="social-midia-content-wrap">
              <q-btn href="https://www.facebook.com/Comunidade.SPDATA" color="white" class="footer-icon" icon="img:https://image.flaticon.com/icons/svg/59/59439.svg" round/>
              <q-btn color="white" class="footer-icon" icon="img:https://image.flaticon.com/icons/svg/2111/2111532.svg" round/>
              <q-btn color="white" class="footer-icon" icon="img:https://image.flaticon.com/icons/svg/733/733635.svg" round/>
            </div>
          </div>
        </div>
        <div class="col text-bold footer-el">Contato
          <div class="col">
            <q-list dense bordered padding class="rounded-borders">
            <q-item clickable v-ripple>
              <q-item-section avatar>
                <q-icon color="white" name="local_phone" />
              </q-item-section>
              <q-item-section>
                (31) 3399-2500
              </q-item-section>
            </q-item>

            <q-item clickable v-ripple>
              <q-item-section avatar>
                <q-icon color="white" name="local_phone" />
              </q-item-section>
              <q-item-section>
                (31) 9 9382-5500
              </q-item-section>
            </q-item>

            <q-item clickable v-ripple>
              <q-item-section avatar>
                <q-icon color="white" name="email" />
              </q-item-section>
              <q-item-section>
                comercial@spdata.com.br
              </q-item-section>
            </q-item>
          </q-list>
          </div>
        </div>
        <div class="col text-bold">
          Geral
          <div class="col">
          <q-list dense bordered padding class="rounded-borders">
            <q-item clickable v-ripple>
              <q-item-section>
                Portal do cliente
              </q-item-section>
            </q-item>
            <q-item clickable v-ripple>
              <q-item-section>
                Portal do colaborador
              </q-item-section>
            </q-item>
            <q-item clickable v-ripple>
              <q-item-section>
                Trabalhe conosco
              </q-item-section>
            </q-item>
          </q-list>
          </div>
        </div>
      </div>
    </div>
  </q-page>
</template>

<script>

window.onscroll = function() {
  scrollFunction();
};

function scrollFunction() {
  if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
    document.getElementById("header").classList.add("header-colapsed");
    document.getElementById("links-header").style.display = "none";
  } else {
    document.getElementById("links-header").style.display = "flex";
    document.getElementById("header").classList.remove("header-colapsed");
  }
}

export default {
  name: "PageIndex",
  data() {
    return {
      visible: false,
      content_2_text_body:
        "Com soluções modularizadas e adaptáveis, a SPDATA possui sistemas capazes de se adequar perfeitamente aos diversos modelos de gestão e porte da instituição de saúde.",
      slide: 1,
      expanded: false
    };
  },
  computed: {
    cardContainerClass() {
      if (this.$q.screen.gt.xs) {
        return (
          "grid-masonry grid-masonry--" + (this.$q.screen.gt.sm ? "3" : "2")
        );
      }

      return void 0;
    },

    rowsPerPageOptions() {
      if (this.$q.screen.gt.xs) {
        return this.$q.screen.gt.sm ? [3, 6, 9] : [3, 6];
      }

      return [3];
    }
  },
  watch: {
    "$q.screen.name"() {
      this.pagination.rowsPerPage = this.getItemsPerPage();
    }
  },
  methods: {
    getItemsPerPage() {
      const { screen } = this.$q;
      if (screen.lt.sm) {
        return 3;
      }
      if (screen.lt.md) {
        return 6;
      }
      return 9;
    },
    contact() {
      this.$router.push("/contato");
    }
  }
};
</script>

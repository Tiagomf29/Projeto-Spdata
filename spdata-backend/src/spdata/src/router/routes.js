import menu from 'layouts/MainLayout.vue'
import index from 'pages/Index.vue'
import contact from 'pages/Contact.vue'
const routes = [
  {
    path: '/',
    component: menu,
    children: [
      { path: '', component: index },
      { path: '/contato', component: contact }
    ]
  }
]

// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue')
  })
}

export default routes

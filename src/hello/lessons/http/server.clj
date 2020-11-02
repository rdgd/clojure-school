(ns hello.lessons.http.server
  (:require [ring.adapter.jetty :as jetty]
            [compojure.core :refer [defroutes GET POST DELETE]]
            [compojure.route :as route]
            [ring.util.response :refer [response]]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.json :refer [wrap-json-response]]))

(defn hello-world
  [req]
  (println req)
  {:hello "world"})

(defroutes v1
  (GET "/v1/hello-world" req
       (response (hello-world req)))

  (route/not-found (response {:message "not found"})))

(def app (-> v1
             (wrap-json-response)
             (wrap-params)))

(defn -main
  []
  (jetty/run-jetty app {:port 8080}))




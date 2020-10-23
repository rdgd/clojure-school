(ns hello.core
  (:require [clojure.test :as t]
            [clojure.repl :refer :all]))

(defn add [a b] (+ a b))

(defn -main [& args] (println "hooray!"))

(+ 1 2) ;Put your cursor over the opening paren and type ctrl + return

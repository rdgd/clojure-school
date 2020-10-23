(ns hello.core
  (:require [clojure.test :as t]
            [clojure.repl :refer :all]))

; Functions and defs
(def my-name "General Kenobi")

; This is a named function, which uses the defn macro. You will use this a lot!
(defn greeting
  "This string documents my function for other developers."
  [n]
  (str n ", you are a bold one!"))

; Writing a function like above, is equivalent to...
(def greeting2 (fn [n] (str n ", you are a bold one!")))

; This is also equivalent to...
(def greeting3 #(str %1 ", you are a bold one!"))

; This is because defn is a macro, which gives us sugar around def'ing a function

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; Exercise
; Put your cursor over the opening paren and evaluate the expression (in VS Code it's: ctrl + return)
(+ 1 2) ; => 3

; Since we have the clojure.repl namespace loaded, we can look up the documentation as well as the source code for
; + the function we just used
; (doc +)
; (source +)

; See if you can implement the function add, uncomment the line below, invoke it, and observe the output
;(add 1 2) ; => 3

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main [& args] (println "hooray and welcome!"))

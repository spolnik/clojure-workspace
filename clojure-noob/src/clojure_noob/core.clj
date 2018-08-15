(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (if (= 0 1)
             (do (println "Failure!")
                 "omg 0 == 1!!")
             (do (println "Success!!")
                 "of course 0 <> 1")
             ))
  (println "I'm a little teapot!"))



(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "This is example start learning project"
  :url "https://github.com/spolnik/clojure-workspace"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-noob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

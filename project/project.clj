(defproject project "0.01"
  :description "Aleph testing"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [aleph "0.3.0-alpha2"]
                 [compojure "1.1.1"]
                 [ring "1.1.6"]
                 [hiccup "1.0.1"]
                 [lein-swank "1.4.4"]]
  :source-paths ["src/clj"]
  :ring {:handler core.main/-main}
  :main core.main)

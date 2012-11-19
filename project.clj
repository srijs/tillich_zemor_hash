; project file for Leiningen 1.7.1
(defproject phlegmaticprogrammer/tillich_zemor_hash "0.1.0-SNAPSHOT"
  :description "Tillich-Zemor hash functions"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :dev-dependencies [[lein-autodoc "0.9.0"]]
  :test-path "src"
  :java-source-path "javasrc"
  :aot [phlegmaticprogrammer.tillich_zemor_hash]
  :plugins [[lein-swank "1.4.4"]])
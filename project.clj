(defproject com.dcj/clj-postgresql "0.7.1-SNAPSHOT"

  :description "PostgreSQL helpers for Clojure projects"

  :url "https://github.com/remodoy/clj-postgresql"

  :license {:name "Two clause BSD license"
            :url "http://github.com/remodoy/clj-postgresql/README.md"}

  ;; :repositories [["releases" {:url "https://nexus.futurumlab.io"
  ;;                             :username [:gpg :env/nexus_username]
  ;;                             :password [:gpg :env/nexus_password]}]]

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.postgresql/postgresql "42.2.5"]
                 [net.postgis/postgis-jdbc "2.2.1" :exclusions [postgresql org.postgresql/postgresql]]
                 [cheshire "5.8.0"]
                 [com.jolbox/bonecp "0.8.0.RELEASE"]
                 ;; DCJ: Duplicated by clj-time?
                 ;; [clj-time "0.14.4"]
                 [org.clojure/java.data "0.1.1"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [prismatic/schema "1.1.9"]]

  :jvm-opts ["-Xmx2g" "--add-modules" "java.xml.bind"]

  :codox {:output-path "resources/doc/api/clj-postgresql"}

  :profiles {:dev {:dependencies [[midje "1.9.2"]
                                  [org.slf4j/slf4j-simple "1.7.25"]]
                   :plugins [[lein-midje "3.1.1"]]}})

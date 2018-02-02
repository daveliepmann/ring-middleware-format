(defproject ring-middleware-format "0.8.0-SNAPSHOT"
  :description "Ring middleware for parsing parameters and emitting
  responses in various formats (mainly JSON, YAML and Transit out of
  the box)"
  :url "https://github.com/ngrunwald/ring-middleware-format"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/core.memoize "0.5.9"]
                 [ring/ring-core "1.6.3"]
                 [cheshire "5.8.0"]
                 [org.clojure/tools.reader "1.2.1"]
                 [com.ibm.icu/icu4j "60.2"]
                 [circleci/clj-yaml "0.5.6"]
                 [clojure-msgpack "1.2.1"]
                 [com.cognitect/transit-clj "0.8.300"]]
  :plugins [[lein-codox "0.10.2"]]
  :codox {:src-uri "http://github.com/ngrunwald/ring-middleware-format/blob/master/{filepath}#L{line}"
          :defaults {:doc/format :markdown}}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.6:dev,1.7:dev,1.9"]})

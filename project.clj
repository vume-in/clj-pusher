(defproject pekaplay-clj-pusher "0.3.1"
  :description "Pusher (http://www.pusherapp.com) Client for Clojure"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/data.json "0.1.2"]
                 [clj-http "0.3.5"]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]]
  :plugins [[s3-wagon-private "1.3.5"]]
  ; access private artifact from s3          
  :repositories [["pekaplay" {:url "s3p://pekaplay-jars/releases/"
                            :no-auth true
                            :sign-releases false}]]
)
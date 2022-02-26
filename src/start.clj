(ns start
  (:require
   [nrepl.server :as nrepl]
   [services.http :as http])
  (:gen-class))


(defn -main [& args]
  (println "Starting nrepl server")
  (nrepl/start-server :port 7888)
  (println "Starting HTTP server")
  (http/start)
  (.read (System/in))
  (println "The end."))
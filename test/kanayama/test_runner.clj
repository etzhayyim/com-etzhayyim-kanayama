(ns kanayama.test-runner
  (:require [clojure.test :as t]
            [kanayama.murakumo-test]
            [kanayama.methods.test-agent]
            [kanayama.methods.test-charter-gates]
            [kanayama.cells.air-emissions-audit.test-state-machine]
            [kanayama.cells.cold-rolling-finishing.test-state-machine]
            [kanayama.cells.dc-casting.test-state-machine]
            [kanayama.cells.decoating-separation.test-state-machine]
            [kanayama.cells.dross-recovery.test-state-machine]
            [kanayama.cells.hot-rolling.test-state-machine]
            [kanayama.cells.intake-qa.test-state-machine]
            [kanayama.cells.mass-balance-binder.test-state-machine]
            [kanayama.cells.melting-furnace.test-state-machine]))

(def suites
  '[kanayama.murakumo-test
    kanayama.methods.test-agent
    kanayama.methods.test-charter-gates
    kanayama.cells.air-emissions-audit.test-state-machine
    kanayama.cells.cold-rolling-finishing.test-state-machine
    kanayama.cells.dc-casting.test-state-machine
    kanayama.cells.decoating-separation.test-state-machine
    kanayama.cells.dross-recovery.test-state-machine
    kanayama.cells.hot-rolling.test-state-machine
    kanayama.cells.intake-qa.test-state-machine
    kanayama.cells.mass-balance-binder.test-state-machine
    kanayama.cells.melting-furnace.test-state-machine])

(defn -main [& _]
  (let [{:keys [fail error]} (apply t/run-tests suites)]
    (when (pos? (+ fail error))
      (System/exit 1))))

# kanayama 金山 — Maturity

**Stage: R0** (scaffold) — ADR-2605252400. Circular-metallurgy actor (Wave 1 = closed-loop
UBC aluminum recycling). RECYCLING-ONLY by constitution; mass-balance ≥98% closure; recovery
≥95% + ≤6 kWh/kg; renewable energy only. Closes the EOL loop for igata/suki (kanayama
recovers what they cast).

| Dimension | State |
|---|---|
| Lexicons | ✅ 8 canonical semantic EDN under `data/lex`; Datomic projections under `data/lex-datoms`; JSON snapshots under `wire/lex` |
| Cells | ✅ 9 canonical CLJC state machines under `src/kanayama/cells` |
| Manifest | ✅ canonical `manifest.edn` — gates G1–G14 + non-goals N1–N8 |
| Tests | ✅ `bb test`: **55 tests / 176 assertions / 0 failures** (2026-07-18) |
| Methods | 🟡 canonical CLJC agent + Murakumo planner; live metallurgy = R1 |
| Audit | ✅ EDN syntax, canonical/wire lexicon names, wire boundary, deprecated artifacts |

## Charter gates pinned by the new charter-gate test

- **Full gate set** — manifest `constitutionalGates.gates` declares exactly G1–G14.
- **Recycling-only (N1–N4)** — N1 excludes bauxite/primary mining; N2 excludes Hall-Héroult
  primary smelting; N3 excludes munitions/cartridge-brass recovery; N4 excludes
  nuclear-decontamination feedstock.
- **G2/G12/G13 quantitative** — mass-balance ≥98% closure; recovery ≥95%; captive
  coal/petcoke prohibited (renewable energy only).
- **G8 emissions/leachate** — `airEmissionsAuditRecord.regulatoryBasis` cites EU IED
  2010/75/EU + EN 12457 leachate (+ JP 大気汚染防止法 / JIS K 0058).
- **G4 witness quorum** — `meltingAttestation` requires `attestingRobots` + `alloyComposition`.

## R0 → R1 gate

silenRecyclingReview `r1-benchtop-pot-melt` + Council Lv6+ + metallurgist SME
(ADR-2605252415); G2/G12 quantitative caps enforced in the R1 cell logic.

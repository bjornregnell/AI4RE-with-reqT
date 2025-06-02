# Survey on AI4RE context

* Hypothesis: When using an LLM to support RE it is beneficial to include general RE concepts in the context of the chat.

* Question: For each of the entity types in the reqT meta model, which do you think would be helpful to use (1) or hurtful to use (0) as general RE context to help the LLM to focus?

* How to answer the survey:
  1. Download this file [answer-NN.csv](https://github.com/bjornregnell/AI4RE-with-reqT/blob/main/survey/answer-NN.csv)  and rename it by replacing `NN` with something else.
  2. For each entity type fill in either `1` or `0` in the `use` column, according to this semantics:
    * Enter `1` if you think it would be more likely than not that it would **HELP** the LLM operation if the concept and its definition in is included in the context of an LLM when used to support RE.
    * Enter `0` if you think it would be more likely than not that it would **HURT** the LLM operation if the concept and its definition in is included in the context of an LLM when used to support RE.
  3. Provide a PR after forking this repo by adding your answer file under a unique name to [this dir](https://github.com/bjornregnell/AI4RE-with-reqT/tree/main/survey) or email the file to `bjorn.regnell@cs.lth.se`
# Stanford coursework workspace

This repo is where you help the user with their Stanford classes. They give you
tasks in chat or in `TASKS.md`; you do the work here, save it in the course's
folder, and commit it.

## Layout

- `TASKS.md`: the task board. When the user says "do my tasks" (or similar), work
  through **To do** from the top. When a task is finished, move it to the top of
  **Done**, check it off, and add a link to the result.
- `courses/<CODE>/`: one folder per class, named by course code without spaces
  (`CS106B`, `MATH51`, `PWR1`).
  - `README.md`: the course card, with quarter, instructor, links, grading,
    deadlines and notes. Read it before doing anything for that course.
  - `assignments/<name>/`: one folder per assignment, holding the prompt
    (`prompt.md` or the handout file) and the work.
  - `notes/`: lecture and reading notes, summaries.
  - `study/`: study guides, practice problems, flashcards, exam prep.
- `courses/_template/`: copy it to add a class, then fill in the card from the
  syllabus the user gives you.
- `javaBonusTasks.java`: an older Java exercise, not part of this workspace.

## Doing a task

1. Open the course folder (create it from the template if it's new) and read the card.
2. Find the assignment prompt. If it isn't in the repo, ask the user to paste or
   upload it, then save it in the assignment folder (see Privacy).
3. Do the work, following the conventions below.
4. Update `TASKS.md`, and the card's deadlines if you learned new dates.
5. Commit with the course code first (`CS106B: midterm 1 study guide`) and push.

## Privacy

The repo may be public. Commit assignment prompts, handouts and graded work only
after confirming the repo is private; if you can't confirm it, ask first. Many
courses forbid posting solutions, and sharing them can count as giving
unpermitted aid. Notes and study guides written in your own words are fine either
way. Never commit grades, student IDs or login details.

## Conventions

- Markdown for writing; `$...$` and `$$...$$` for math (GitHub renders it).
- Code in the language and style the course uses, with a line on how to run it.
- File names say what's inside: `notes/lecture-05-recursion.md`,
  `study/midterm-1-guide.md`.
- Absolute dates (`Oct 17`), never "next Friday".

## About the user

Add lasting study preferences here as you learn them (how they like
explanations, pace, format).

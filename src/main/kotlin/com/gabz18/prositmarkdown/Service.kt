package com.gabz18.prositmarkdown

import org.springframework.stereotype.Service

/**
 *
 * @author gritzenthaler
 */
@Service
class MarkdownPrositGenerator {

    // Todo use beautifer

    fun generate(prosit: Prosit): String {
        val sb = StringBuilder()
        sb.append(initTitleString(prosit.title))
        sb.append(initLearningObjectives())
        sb.append(initKeywords(prosit.keywords))
        sb.append(initContext(prosit.context))
        sb.append(initConstraints(prosit.constraints))
        sb.append(initProblems(prosit.problems))
        sb.append(initGeneralisation(prosit.generalisation))
        sb.append(initSolutions(prosit.solutions))
        sb.append(initDeliveries(prosit.deliveries))
        sb.append(initActionPlan(prosit.plan))
        return sb.toString()
    }

    private fun getDoubleCarriageReturn() = "\n\n"

    private fun getToBeFilledString() = "*To be filled...*"

    private fun initTitleString(title: String) =
            StringBuilder("# $title${getDoubleCarriageReturn()}")

    private fun initLearningObjectives() =
            "## Objectifs d'Apprentissage" +
                    getDoubleCarriageReturn() +
                    "![Objectifs apprentissage](./files/obj_appr.png)" +
                    getDoubleCarriageReturn()

    private fun initKeywords(keywords: List<String>): StringBuilder {
        val sb = StringBuilder("## Mots Clés").append(getDoubleCarriageReturn())
        for (keyword in keywords) {
            sb.append("- ### $keyword")
            sb.append(getDoubleCarriageReturn())
            sb.append(getToBeFilledString())
            sb.append(getDoubleCarriageReturn())
            sb.append("-------")
            sb.append(getDoubleCarriageReturn())
        }
        return sb
    }

    private fun initContext(context: String) =
            "## Contexte${getDoubleCarriageReturn()}$context${getDoubleCarriageReturn()}"

    private fun initConstraints(constraints: List<String>) : StringBuilder {
        val sb = StringBuilder("## Contraintes").append(getDoubleCarriageReturn())
        if (constraints.isEmpty()) {
            sb.append("*Pas de contraintes.*").append(getDoubleCarriageReturn())
        }
        for (constraint in constraints) {
            sb.append("- $constraint").append(getDoubleCarriageReturn())
        }
        return sb
    }

    private fun initProblems(problems: List<String>): StringBuilder {
        val sb = StringBuilder("## Problématiques").append(getDoubleCarriageReturn())
        if (problems.isEmpty()) {
            sb.append("*Pas de problématiques").append(getDoubleCarriageReturn())
        }
        for (problem in problems) {
            sb
                    .append("- $problem")
                    .append(getDoubleCarriageReturn())
                    .append(getToBeFilledString())
                    .append(getDoubleCarriageReturn())
        }
        return sb
    }

    private fun initGeneralisation(generalisation: String) =
            "## Généralisation" +
                    getDoubleCarriageReturn() +
                    generalisation +
                    getDoubleCarriageReturn()

    private fun initSolutions(solutions: List<String>): StringBuilder {
        val sb = StringBuilder("## Pistes de Solution").append(getDoubleCarriageReturn())
        if (solutions.isEmpty()) {
            sb
                    .append("*Pas de pistes de solution.*")
                    .append(getDoubleCarriageReturn())
        }
        for (solution in solutions) {
            sb
                    .append("- <span style=\"color: black\">$solution</span>")
                    .append(getDoubleCarriageReturn())
        }
        return sb
    }

    private fun initDeliveries(deliveries: List<String>): StringBuilder {
        val sb = StringBuilder("## Livrables").append(getDoubleCarriageReturn())
        if (deliveries.isEmpty()) {
            sb.append("*Pas de livrables.*").append(getDoubleCarriageReturn())
        }
        for (delivery in deliveries) {
            sb.append("- $delivery").append(getDoubleCarriageReturn())
        }
        return sb
    }

    private fun initActionPlan(actionPlanItems: List<String>): StringBuilder {
        val sb = StringBuilder("## Plan d'Action").append(getDoubleCarriageReturn())
        if (actionPlanItems.isEmpty()) {
            sb.append("*Pas de plan d'action.*", getDoubleCarriageReturn())
        }
        var i = 0
        for (item in actionPlanItems) {
            i++
            sb
                    .append("$i. $item")
                    .append(getDoubleCarriageReturn())
                    .append(getToBeFilledString())
                    .append(getDoubleCarriageReturn())
        }
        return sb
    }
}
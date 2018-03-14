Narrative:
yo como usuario de qvision technologies
quiero registrarme en el contacto de la pagina web
para quedar posteriormente inscrito

Scenario: registro en el contacto
Given que estoy en la pagina de qvision technologies
When me registre con nombre<nombre>, email<email>, numContacto<numContacto>, nombreEmpresa<nombreEmpresa>, ciudad<ciudad>, asunto<asunto>, mensaje<mensaje>
Then quedo registrado

Examples:
|nombre |email | numContacto | nombreEmpresa|ciudad |asunto |mensaje |
|Aleja|aleja@hotmail|123|Qvision|Medellín|Prueba|Prueba
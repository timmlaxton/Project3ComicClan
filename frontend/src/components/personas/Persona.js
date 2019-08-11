import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Persona = (props) =>{

  if(!props.persona){
    return "Loading...character"
  }

  return (
    <React.Fragment>
      <h1>Name: {props.persona.name}</h1>
      <p>Alias: {props.persona.alias}</p>
      <p>Super Power: {props.persona.superPower}</p>
      <p>First Appearance: {props.persona.firstAppearance}</p>
    </React.Fragment>
  )

}

export default Persona;

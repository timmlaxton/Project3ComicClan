import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js';
import LoginPage from './users/LoginPage';
import ComicList from '../components/comics/ComicList';
import ComicDetailContainer from '../containers/comics/ComicDetailContainer';
import PersonaList from '../components/personas/PersonaList';
import PublisherList from '../components/publishers/PublisherList';
import ReviewFormContainer from './reviews/ReviewFormContainer';
import Request from '../helpers/request';
import PersonaDetails from '../components/personas/PersonaDetails'
import UserPage from '../components/users/UserPage'
import UserEditFormContainer from './users/UserEditFormContainer';


class MainContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      comics: [],
      personas: [],
      publishers: [],
      users: [],
      reviews: [],
      currentUser: null,
      comic: null
    };
    this.handleUserSelect = this.handleUserSelect.bind(this);
    this.findComicById = this.findComicById.bind(this);
    this.findCharacterById = this.findCharacterById.bind(this);

    this.findUserById = this.findUserById.bind(this);
    this.handleDelete = this.handleDelete.bind(this);

    this.handleReviewAdded = this.handleReviewAdded.bind(this);

  }


  componentDidMount(){
    const request = new Request()

    const promise1 = request.get('/api/comics');
    const promise2 = request.get('/api/personae');
    const promise3 = request.get('/api/publishers');
    const promise4 = request.get('/api/users');
    const promise5 = request.get('/api/reviews')

    const promises = [promise1, promise2, promise3, promise4, promise5];

    Promise.all(promises).then((data) => {
      this.setState({
        comics: data[0]._embedded.comics,
        personas: data[1]._embedded.personae,
        publishers: data[2]._embedded.publishers,
        users: data[3]._embedded.users,
        reviews: data[4]._embedded.reviews
      })
    })
  }

  handleUserSelect(currentUser){
    this.setState({currentUser})
  }

  handleReviewAdded(updatedComic){
    const index = this.state.comics.indexOf(comic => comic.id === updatedComic.id)
    const updatedComics = this.state.comics
    updatedComics[index] = updatedComic
    this.setState({comics: updatedComics})
  }

  findComicById(id){
    // const comic = this.state.comics.find((comic) => {
    //   return comic.id === parseInt(id)
    // })
    const request = new Request()
    request.get('/api/comics/' + id)
    .then((data) => {
      this.setState({comic: data})
    })
  }

  findCharacterById(id){
      const persona = this.state.personas.find((persona) => {
        return persona.id === parseInt(id)
      })
      return persona;
    }

    findUserById(id){
      const user = this.state.users.find((user) => {
        return user.id === parseInt(id)
      })
      return user;
    }

    handleDelete(id){
      const request = new Request()
      const url = '/api/users/' + this.state.currentUser.id;
      request.delete(url).then(() => {
        window.location = '/';
      })
     }

  render(){

    return (
    <div>
      <Router>
        <React.Fragment>

          <NavBar />

          <Switch>
            {/* Login Page */}
            <Route exact path="/" render={() => {

              return <LoginPage users={this.state.users} handleUserSelect={this.handleUserSelect} user={this.state.currentUser}/>

            }} />

            {/* Get User Page */}
            <Route exact path="/users/:id" render={(props) => {
              return <UserPage user={this.state.currentUser} users={this.state.users} comics={this.state.comics} onDelete={this.handleDelete}/>
            }} />

            {/* Edit a user */}
            <Route exact path="/users/edit/:id" render={(props) => {
              return <UserEditFormContainer user={this.state.currentUser} handleUserSelect={this.handleUserSelect}/>

            }} />

            {/* Get all comics */}
            <Route exact path="/comics" render={(props) => {
              return <ComicList comics={this.state.comics}/>
            }} />

            {/* Get one comic */}
            <Route exact path="/comics/:id" render={(props) => {
              const id = props.match.params.id;
              const comic = this.findComicById(id);
              return <ComicDetailContainer comic={this.state.comic} user={this.state.currentUser} handleUserSelect={this.handleUserSelect} handleReviewAdded={this.handleReviewAdded}/>
            }} />

            {/* Get all characters */}
            <Route exact path="/characters" render={(props) => {
              return <PersonaList personas={this.state.personas}/>
            }} />

            {/* Get one character */}
           <Route exact path="/characters/:id" render={(props) => {
            const id = props.match.params.id;
            const persona = this.findCharacterById(id);
            return <PersonaDetails persona={persona} />
               }} />

            {/* Get all publishers */}
            <Route exact path="/publishers" render={(props) => {
              return <PublisherList publishers={this.state.publishers}/>
            }} />

          </Switch>
        </React.Fragment>
      </Router>
    </div>
  )
  }

}

export default MainContainer;
